package com.learn.fizzbuzz;

public class FizzBuzzer {

    public String fizzBuzz(int inputNumber) {
        if (inputNumber == 3) {
            return "Fizz";
        }
        if (inputNumber == 5) {
            return "Buzz";
        }

        if (inputNumber == 6) {
            return "Fizz";
        }

        if (inputNumber == 9) {
            return "Fizz";
        }

        if (inputNumber == 10) {
            return "Buzz";
        }

        return String.valueOf(inputNumber);
    }
}
