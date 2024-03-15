package com.udemy.courses.javadesignpatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void testClient() {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeemachine enhanced = new EnhancedCoffeemachine(normal);

        normal.makeSmallCoffee();
        normal.makeLargeCoffee();
        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffee();
        enhanced.makeMilkCoffee();

        assertEquals(1,1);
    }

}