package com.github.llz.transformer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransformerInfoBean {
    private String className;
    private String methodName;
    private String[] parameterTypes;
    private String returnType;
}
