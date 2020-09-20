package com.wojciech.concatenator.service;

import com.wojciech.concatenator.dto.ConcatenationResult;
import com.wojciech.concatenator.strategy.ConcatenationStrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegerConcatenationService implements ConcatenationService {
    private ConcatenationStrategy<Integer> strategy;

    @Autowired
    public IntegerConcatenationService(ConcatenationStrategy<Integer> strategy) {
        this.strategy = strategy;
    }

    @Override
    public ConcatenationResult concatenate(Object[] values) {
        Integer resultValue = 0;
        StringBuilder builder = new StringBuilder();
        for (Object val : values) {
            if (val instanceof Integer) {
                builder.append("value: ").append(val).append("\n");
                resultValue = strategy.concatenate(resultValue, (Integer) val);
            } else {
                throw new IllegalStateException("Wrong type of data was provided: " + val.getClass().getTypeName() + " instead of Integer");
            }
        }

        ConcatenationResult result = new ConcatenationResult();
        result.setValues(builder.toString());
        result.setResult(resultValue.toString());
        return result;
    }
}
