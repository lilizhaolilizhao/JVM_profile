package com.github.llz.transformer;

import java.util.*;

public class TransformerContext {
    public static Map<String, List<TransformerInfoBean>> transInfoMap = new HashMap<String, List<TransformerInfoBean>>();

    static {
        //Tomcat StandardHostValve
        //tomcat 6 & tomcat 7
        addTransformerInfo("org.apache.catalina.core.StandardService", "start", new String[]{}, "void");
        addTransformerInfo("org.apache.catalina.core.StandardService", "startInternal", new String[]{}, "void");

        System.out.println(transInfoMap);
    }

    /**
     * 添加transformer方法
     * @param className
     * @param methodName
     * @param paramTypes
     * @param returnType
     */
    private static void addTransformerInfo(String className, String methodName, String[] paramTypes, String returnType) {
        if (transInfoMap.containsKey(className)) {
            List<TransformerInfoBean> transformerInfoBeans = transInfoMap.get(className);

            transformerInfoBeans.add(new TransformerInfoBean(className, methodName, paramTypes, returnType));
        } else {
            List<TransformerInfoBean> transformerInfoBeans = new ArrayList<TransformerInfoBean>();
            transformerInfoBeans.add(new TransformerInfoBean(className, methodName, paramTypes, returnType));

            transInfoMap.put(className, transformerInfoBeans);
        }
    }
}
