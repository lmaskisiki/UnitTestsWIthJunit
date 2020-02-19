package com.learn.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BuzzTests {

    //DEVNOTE : for more info : https://github.com/junit-team/junit4/wiki/Parameterized-tests
    // DEVNOTE: JUnitParams - something better - https://www.baeldung.com/junit-params

    private final int input;
    private final String output;

    public BuzzTests(int input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, "Buzz"}, {10, "Buzz"}, /*{15, "???"},*/{20, "Buzz"}
        });
    }

    @Test
    public void fizzBuzz_givenOnlyMultiplesOfFive_ShouldReturnBuzz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(input);
        //assert
        Assert.assertEquals(output, results);
    }
}
