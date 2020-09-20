package com.wojciech.concatenator.source;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomIntegerGenerator implements DataSource<Integer> {
    private final Random generator = new Random();

    @Override
    public Integer getValue() {
        return generator.nextInt();
    }
}
