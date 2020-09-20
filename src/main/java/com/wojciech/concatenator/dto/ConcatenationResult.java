package com.wojciech.concatenator.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ConcatenationResult {
    private List<Object> values = new ArrayList<>();
    private String result;

    public void addValue(Object newValue){
        values.add(newValue);
    }
}
