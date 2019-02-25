package com.github.llz.transformer;

import java.util.HashMap;
import java.util.Map;

public class TransformerContext {
    public static Map<String, TransformerInfoBean> transInfoMap = new HashMap<String, TransformerInfoBean>();

    static {
        //Tomcat StandardHostValve
        //tomcat 6
        transInfoMap.put("org.apache.catalina.core.StandardService", new TransformerInfoBean("org.apache.catalina.core.StandardService",
                "start", new String[]{}, "void"));
        //tomcat 7
        transInfoMap.put("org.apache.catalina.core.StandardService", new TransformerInfoBean("org.apache.catalina.core.StandardService",
                "startInternal", new String[]{}, "void"));

    }
}
