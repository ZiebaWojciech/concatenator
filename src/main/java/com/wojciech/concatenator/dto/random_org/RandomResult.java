package com.wojciech.concatenator.dto.random_org;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Random field with data based on on https://api.random.org/json-rpc/2/basic
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomResult {
    private int[] data;
    private String completionTime;
}
