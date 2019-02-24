package com.github.llz.transformer;

import com.github.llz.util.JVMUtils;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.commons.AnalyzerAdapter;
import org.objectweb.asm.commons.LocalVariablesSorter;

public class TomcatTransformer extends GeneralMethodAdapter {
    public String myClassName = "org.apache.catalina.core.StandardHostValve";
    public String myMethodName = "invoke";
    public String[] myParameterTypes = new String[]{"org.apache.catalina.connector.Request", "org.apache.catalina.connector.Response"};
    public String returnType = "void";

    public TomcatTransformer(ClassVisitor classVisitor) {
        super(classVisitor);
    }

    @Override
    public  MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);

        if (!isInterface && mv != null && owner.equals(JVMUtils.javaNameToJvmName(myClassName))
                && name.equals(myMethodName)
                && descriptor.equals(JVMUtils.javaTypeToJvmSignature(myParameterTypes, returnType))) {
            methodName = name;
            AddTimerMethodAdapter at = new AddTimerMethodAdapter(mv);

            at.aa = new AnalyzerAdapter(owner, access, name, descriptor, at);
            at.lvs = new LocalVariablesSorter(access, descriptor, at.aa);

            return at.lvs;
        }

        return mv;
    }
}
