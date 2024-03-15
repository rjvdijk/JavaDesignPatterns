package com.udemy.courses.javadesignpatterns.behavioral.strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String input) {
        StringBuilder output = new StringBuilder();
        Random random = new Random();
        for (Character ch : input.toCharArray()) {
            output.append(random.nextBoolean() ? ch.toString().toUpperCase() : ch.toString().toLowerCase());
        }
        return output.toString();
    }
}
