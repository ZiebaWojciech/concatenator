package com.wojciech.concatenator.dto.random_org;

/**
 * Methods allowed by Random.org API (see: https://api.random.org/json-rpc/2/basic)
 */
public enum BasicApiMethods {
    GENERATE_INTEGERS("generateIntegers");

    public final String methodName;

    private BasicApiMethods(String methodName) {
        this.methodName = methodName;
    }
}
