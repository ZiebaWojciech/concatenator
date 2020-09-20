package com.wojciech.concatenator.strategy;

import org.springframework.stereotype.Component;

@Component
public class IntegerAdder implements ConcatenationStrategy<Integer> {
    @Override
    public Integer concatenate(Integer first, Integer second) {
        return first + second;
    }
}
