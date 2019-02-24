package com.github.llz.transformer;

import com.github.llz.util.JVMUtils;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AnalyzerAdapter;
import org.objectweb.asm.commons.LocalVariablesSorter;

public class TomcatTransformer extends GeneralMethodAdapter {

    public TomcatTransformer(ClassVisitor classVisitor) {
        super(classVisitor);
    }

    @Override
    public  MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);

        if (!isInterface && mv != null) {
            MethodVisitor at = addStandardHostValue(access, name, descriptor, mv);
            if (at != null) return at;
        }

        return mv;
    }

    private MethodVisitor addStandardHostValue(int access, String name, String descriptor, MethodVisitor mv) {
        if (JVMUtils.javaNameToJvmName("org.apache.catalina.core.StandardHostValve").equals(owner) && ("invoke").equals(name)
                && descriptor.equals(JVMUtils.javaTypeToJvmSignature(new String[]{"org.apache.catalina.connector.Request", "org.apache.catalina.connector.Response"}, "void"))) {
            methodName = name;
            AddTimerMethodAdapter at = new AddTimerMethodAdapter(mv);

            at.aa = new AnalyzerAdapter(owner, access, name, descriptor, at);
            at.lvs = new LocalVariablesSorter(access, descriptor, at.aa);

            return at.lvs;
        }
        return null;
    }
}
