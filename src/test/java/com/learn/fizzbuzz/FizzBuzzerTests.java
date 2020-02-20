package com.learn.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FizzBuzzerTests {

    @Test
    public void fizzBuzz_givenOne_ShouldReturnOne() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(1);
        //assert
        Assert.assertEquals("1", results);
    }

    @Test
    public void fizzBuzz_givenTwo_ShouldReturnTwo() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(2);
        //assert
        Assert.assertEquals("2", results);
    }

    @Test
    public void fizzBuzz_givenFour_ShouldReturnFour() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(4);
        //assert
        Assert.assertEquals("4", results);
    }

    @Test
    public void fizzBuzz_givenSeven_ShouldReturnSeven() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(7);
        //assert
        Assert.assertEquals("7", results);
    }

    @Test
    public void fizzBuzz_givenEight_ShouldReturnEight() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(8);
        //assert
        Assert.assertEquals("8", results);
    }

    @Test
    public void fizzBuzz_givenNegativeNumbers_ThrowNegativeNumbersNotAllowedException_1() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        Exception exception = assertThrows(NegativeNumbersNowAllowedException.class, () ->
                sut.fizzBuzz(-5));
        assertEquals("Negative numbers are not supported", exception.getMessage());
    }

    @Test
    public void fizzBuzz_givenNegativeNumbers_ThrowNegativeNumbersNotAllowedException_2() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        Exception exception = assertThrows(NegativeNumbersNowAllowedException.class, () ->
                sut.fizzBuzz(-10));
        assertEquals("Negative numbers are not supported", exception.getMessage());
    }

    @Test
    public void fizzBuzz_givenNegativeNumbers_ThrowNegativeNumbersNotAllowedException_3() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        Exception exception = assertThrows(NegativeNumbersNowAllowedException.class, () ->
                sut.fizzBuzz(-1000));
        assertEquals("Negative numbers are not supported", exception.getMessage());
    }

     //DEVENOTE: Junit @Rule, @Test(expected =  Exception.class)
    @Test
    public void fizzBuzz_givenNegativeNumbers_ThrowNegativeNumbersNotAllowedException_5() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        Assertions.assertThatThrownBy(() -> sut.fizzBuzz(-10000))
                .isInstanceOf(NegativeNumbersNowAllowedException.class)
                .hasMessage("Negative numbers are not supported");
    }
}


