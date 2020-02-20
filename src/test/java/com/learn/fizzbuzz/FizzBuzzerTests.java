package com.learn.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class FizzBuzzerTests {

    @ParameterizedTest
    @MethodSource("numbers")
    public void fizzBuzz_givenNumberNotDivisibleByThreeOrFive_ReturnNumber(int input, String expected) {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //act
        String actual = sut.fizzBuzz(input);
        //assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{index}. Negative input ({0})")
    @MethodSource("negativeNumbers")
    public void fizzBuzz_givenNegativeNumber_ThrowNegativeNumbersNotAllowedException(int input) {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        Assertions.assertThatThrownBy(() -> sut.fizzBuzz(input))
                .isInstanceOf(NegativeNumbersNowAllowedException.class)
                .hasMessage("Negative numbers are not supported");
    }


    @Test
    public void fizzBuzz_givenFifteen_ShouldReturnFizzBuzz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //act
        String actual = sut.fizzBuzz(15);
        //assert
        Assert.assertEquals("FizzBuzz", actual);
    }

    @Test
    public void fizzBuzz_givenTwenty_ShouldReturnFizzBuzz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //act
        String actual = sut.fizzBuzz(30);
        //assert
        Assert.assertEquals("FizzBuzz", actual);
    }

    private static Collection<Arguments> numbers() {
        return Arrays.asList(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(4, "4"),
                Arguments.of(11, "11"),
                Arguments.of(14, "14")
        );
    }

    private static Collection<Arguments> negativeNumbers() {
        return Arrays.asList(Arguments.of(-1), Arguments.of(-10), Arguments.of(-1000));
    }
}


