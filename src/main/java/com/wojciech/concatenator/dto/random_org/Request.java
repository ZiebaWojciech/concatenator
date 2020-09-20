package com.wojciech.concatenator.dto.random_org;

import lombok.Data;

/**
 * Request based on https://api.random.org/json-rpc/2/basic
 */
@Data
public class Request {
    private final String jsonrpc = "2.0";
    private BasicApiMethods method;
    private GenerateIntegersParams params;
    private int id;
}
