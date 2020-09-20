package com.wojciech.concatenator.dto.random_org;

public enum BasicApiMethods {
    GENERATE_INTEGERS("generateIntegers");

    public final String methodName;

    private BasicApiMethods(String methodName) {
        this.methodName = methodName;
    }
}
