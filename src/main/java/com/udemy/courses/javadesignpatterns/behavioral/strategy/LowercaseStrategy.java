package com.udemy.courses.javadesignpatterns.behavioral.strategy;

public class LowercaseStrategy implements PrintStrategy {

    @Override
    public String formatString(String input) {
        return input.toLowerCase();
    }
}
