package com.wojciech.concatenator.strategy;

import org.springframework.stereotype.Component;

@Component
public class IntegerAdder implements ConcatenationStrategy<Integer> {
    @Override
    public Integer concatenate(Integer first, Integer second) {
        first = replaceNullWithZero(first);
        second = replaceNullWithZero(second);
        return first + second;
    }

    private Integer replaceNullWithZero(Integer value) {
        return value == null ? 0 : value;
    }
}
