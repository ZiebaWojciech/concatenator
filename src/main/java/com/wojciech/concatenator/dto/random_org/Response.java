package com.wojciech.concatenator.dto.random_org;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Response with required fields based on on https://api.random.org/json-rpc/2/basic
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Result result;
}
