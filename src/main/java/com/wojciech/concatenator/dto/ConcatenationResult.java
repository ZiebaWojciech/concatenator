package com.wojciech.concatenator.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Result object of concatenation with values used to concatenate
 */
@Data
public class ConcatenationResult {
    private List<Object> values = new ArrayList<>();
    private Object result;

    public void addValue(Object newValue){
        values.add(newValue);
    }
}
