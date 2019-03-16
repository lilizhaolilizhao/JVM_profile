package com.github.jvm.agent.advisor;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.AdviceAdapter;
import org.objectweb.asm.commons.Method;

/**
 * 信息编织
 */
public class AdviceWeaver extends ClassVisitor implements Opcodes {
    private String className;

    public AdviceWeaver(ClassVisitor classVisitor, String className) throws NoSuchMethodException {
        super(ASM5, classVisitor);

        this.className = className;
    }

    public static void methodOnBegin(String className, String methodName, String descriptor, Object target, Object[] args) {
        System.out.println("className is " + className);
        System.out.println("methodName is " + methodName);
        System.out.println("descriptor is " + descriptor);
        System.out.println("target is " + target);
        System.out.println("args is " + args);
    }

    public static void methodOnEnd(Object returnVal) {
        System.out.println("------返回值: " + returnVal);
    }

    public static void methodOnThrowing(Object throwException) {
        System.out.println("-----异常: " + throwException);
    }

    Method AdviceWeaver_methodOnBegin = Method.getMethod(AdviceWeaver.class.getDeclaredMethod("methodOnBegin",
            String.class, String.class, String.class, Object.class, Object[].class));

    Method AdviceWeaver_methodOnEnd = Method.getMethod(AdviceWeaver.class.getDeclaredMethod("methodOnEnd", Object.class));

    Method AdviceWeaver_methodOnThrowing = Method.getMethod(AdviceWeaver.class.getDeclaredMethod("methodOnThrowing", Object.class));

    @Override
    public MethodVisitor visitMethod(final int access, final String name, final String descriptor, String signature, String[] exceptions) {
        System.out.println("method name is : " + name);

        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);

        if (name.equals("hello")) {
            return new AdviceAdapter(ASM5, mv, access, name, descriptor) {
                Label beginLabel = new Label();

                Label endLabel = new Label();

                @Override
                protected void onMethodEnter() {
                    push(className);
                    push(name);
                    push(descriptor);
                    loadThisOrNullIfStatic();
                    loadArgArray();

                    invokeStatic(Type.getType(AdviceWeaver.class), AdviceWeaver_methodOnBegin);

                    //标记method begin,用于throwing的try-catch-finally block
                    mark(beginLabel);
                }

                private void loadThisOrNullIfStatic() {
                    if (isStatic()) {
                        push((Type) null);
                    } else {
                        loadThis();
                    }
                }

                private boolean isStatic() {
                    return (ACC_STATIC & methodAccess) == ACC_STATIC;
                }

                @Override
                protected void onMethodExit(int opcode) {
                    if (ATHROW != opcode) {
                        //加载正常的返回值
                        loadReturn(opcode);
                        //只有一个参数就是返回值
                        invokeStatic(Type.getType(AdviceWeaver.class), AdviceWeaver_methodOnEnd);
                    }
                }

                @Override
                public void visitMaxs(int maxStack, int maxLocals) {
                    //每个方法最后调用一次,在visitEnd之前
                    mark(endLabel);
                    catchException(beginLabel, endLabel, Type.getType(Throwable.class));
                    //从栈顶加载异常(复制一份给onThrowing当参数用)
                    dup();
                    invokeStatic(Type.getType(AdviceWeaver.class), AdviceWeaver_methodOnThrowing);
                    //将原有的异常抛出(不破坏原有异常逻辑)
                    throwException();

                    super.visitMaxs(maxStack, maxLocals);
                }

                private void loadReturn(int opcode) {
                    switch (opcode) {
                        case RETURN: {
                            push((Type) null);
                            break;
                        }

                        case ARETURN: {
                            dup();
                            break;
                        }

                        case LRETURN:
                        case DRETURN: {
                            dup2();
                            box(Type.getReturnType(methodDesc));
                            break;
                        }

                        default: {
                            dup();
                            box(Type.getReturnType(methodDesc));
                            break;
                        }
                    }
                }
            };
        }

        return mv;
    }
}
