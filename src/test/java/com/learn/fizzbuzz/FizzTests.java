package com.learn.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzTests {

    private final int input;
    private final String output;

    public FizzTests(int input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, "Fizz"}, {6, "Fizz"}, {9, "Fizz"}, {12, "Fizz"}
        });
    }

    @Test
    public void fizzBuzz_givenOnlyMultiplesOfThree_ShouldReturnFizz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(input);
        //assert
        Assert.assertEquals(output, results);
    }
}
