package com.wojciech.concatenator.strategy;

public interface ConcatenationStrategy<T> {
    T concatenate(T first, T second);
}
