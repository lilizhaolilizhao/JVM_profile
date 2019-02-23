package com.github.llz.util;

import org.junit.Assert;
import org.junit.Test;

public class JVMUtilsTest {

    @Test
    public void javaTypeToJvmSignatureTest() {
        String[] myParameterTypes = new String[]{"org.apache.catalina.connector.Request", "org.apache.catalina.connector.Response"};
        String returnType = "void";

        String desc = JVMUtils.javaTypeToJvmSignature(myParameterTypes, returnType);
        Assert.assertEquals(desc, "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;)V");
    }
}
