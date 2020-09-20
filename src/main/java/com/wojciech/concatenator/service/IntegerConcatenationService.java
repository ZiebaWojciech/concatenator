package com.wojciech.concatenator.service;

import com.wojciech.concatenator.dto.ConcatenationResult;
import com.wojciech.concatenator.strategy.ConcatenationStrategy;

public class IntegerConcatenationService implements ConcatenationService {
    private ConcatenationStrategy<Integer> strategy;

    @Override
    public ConcatenationResult concatenate(Object[] values) {
        Integer resultValue = 0;
        StringBuilder builder = new StringBuilder();
        for (Object val : values) {
            if ( val instanceof Integer) {
                builder.append("value: ").append(val).append("\n");
                resultValue = strategy.concatenate(resultValue, (Integer) val);
            }

        }

        ConcatenationResult result = new ConcatenationResult();

        return null;
    }
}
