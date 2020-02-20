package com.learn.fizzbuzz;

public class FizzBuzzer {

    public String fizzBuzz(int inputNumber) {

        if (inputNumber < 0)
            throw new NegativeNumbersNowAllowedException("Negative numbers are not supported");
        if (isDivisibleByThreeAndFive(inputNumber)) {
            return "FizzBuzz";
        } else if (isDivisibleByThree(inputNumber)) {
            return "Fizz";
        } else if (isDivisibleByFive(inputNumber)) {
            return "Buzz";
        } else {
            return String.valueOf(inputNumber);
        }
    }

    private boolean isDivisibleByThreeAndFive(int inputNumber) {
        return ((inputNumber % 3 == 0) && (inputNumber % 5 == 0));
    }

    private boolean isDivisibleByThree(int inputNumber) {
        return (inputNumber % 3 == 0);
    }

    private boolean isDivisibleByFive(int inputNumber) {
        return (inputNumber % 5 == 0);
    }

    ////
//    private boolean isDivisibleByThreeAndFive(int inputNumber) {
//        return ((inputNumber % 3 == 0) && (inputNumber % 5 == 0));
//    }
//
//    private boolean isDivisibleByThree(int inputNumber) {
//        return ((inputNumber % 3 == 0) && (inputNumber % 5 != 0));
//    }
//
//    private boolean isDivisibleByFive(int inputNumber) {
//        return ((inputNumber % 5 == 0) && (inputNumber % 3 != 0));
//    }
}