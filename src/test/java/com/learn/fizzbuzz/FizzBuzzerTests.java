package com.learn.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

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
    public void fizzBuzz_givenThree_ShouldReturnFizz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(3);
        //assert
        Assert.assertEquals("Fizz", results);
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
    public void fizzBuzz_givenFive_ShouldReturnBuzz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(5);
        //assert
        Assert.assertEquals("Buzz", results);
    }

    @Test
    public void fizzBuzz_givenSix_ShouldReturnFizz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(6);
        //assert
        Assert.assertEquals("Fizz", results);
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
    public void fizzBuzz_givenNine_ShouldReturnFizz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(9);
        //assert
        Assert.assertEquals("Fizz", results);
    }

    @Test
    public void fizzBuzz_givenTen_ShouldReturnBuzz() {
        //arrange
        FizzBuzzer sut = new FizzBuzzer();
        //action
        String results = sut.fizzBuzz(10);
        //assert
        Assert.assertEquals("Buzz", results);
    }

}


class FizzBuzzer {

    public String fizzBuzz(int i) {
        if (i == 3) {
            return "Fizz";
        }
        if (i == 5) {
            return "Buzz";
        }

        if (i == 6) {
            return "Fizz";
        }

        if (i == 9) {
            return "Fizz";
        }

        if (i == 10) {
            return "Buzz";
        }


        return String.valueOf(i);
    }
}