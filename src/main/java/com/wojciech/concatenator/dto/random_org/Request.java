package com.wojciech.concatenator.dto.random_org;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Request based on https://api.random.org/json-rpc/2/basic
 */
@Data
@AllArgsConstructor
public class Request {
    private final String jsonrpc = "2.0";
    private String method;
    private GenerateIntegersParams params;
    private int id;
}
