package com.learn.fizzbuzz;

public class NegativeNumbersNowAllowedException extends RuntimeException {
    public NegativeNumbersNowAllowedException(String message) {
        super(message);
    }
}
