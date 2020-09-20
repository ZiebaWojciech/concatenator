package com.wojciech.concatenator.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerAdderTest {
    private IntegerAdder underTest;

    @BeforeEach
    void setup() {
        underTest = new IntegerAdder();
    }

    @Test
    void addTwoIntegers(){
        //given
        Integer first = 12;
        Integer second = 10;

        //when
        Integer result = underTest.concatenate(first, second);

        //then
        assertEquals(22, result);
    }
}