package com.wojciech.concatenator.dto.random_org;

import lombok.Data;

/**
 * Request params based on https://api.random.org/json-rpc/2/basic for generateIntegers method
 */
@Data
public class GenerateIntegersParams {
    private String apiKey;
    private int n;
    private int min;
    private int max;
}
