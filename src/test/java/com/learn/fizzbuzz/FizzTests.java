package com.learn.fizzbuzz;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzTests {

    @ParameterizedTest
    @CsvSource({"3,Fizz", "6,Fizz", "9,Fizz", "12,Fizz"})
    @DisplayName("Given number is divisible by 3 return 'Fizz'")
    public void fizzBuzz_givenOnlyMultiplesOfThree_ShouldReturnFizz(int input, String expected) {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //act
        String results = sut.fizzBuzz(input);
        //assert
        Assert.assertEquals(expected, results);
    }
}
