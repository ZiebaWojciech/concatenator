package com.wojciech.concatenator.dto.random_org;

import lombok.Data;

/**
 * Random field with data based on on https://api.random.org/json-rpc/2/basic
 */
@Data
public class RandomResult {
    private int[] data;
    private String completionTime;
}
