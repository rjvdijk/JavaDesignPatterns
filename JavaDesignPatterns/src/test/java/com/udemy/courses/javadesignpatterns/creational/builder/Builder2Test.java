package com.udemy.courses.javadesignpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Builder2Test {

    @Test
    void builder() {
        Apartment2 ap1 = Apartment2.builder()
                .setSqm(25)
                .setRooms(2)
                .setCity("London")
                .setArea("Kensington")
                .setKitchen(true)
                .build();
        ap1.display();

        Apartment2 ap2 = Apartment2.builder()
                .setRooms(3)
                .setCity("Paris")
                .build();
        ap2.display();

        assertEquals(1,1);
    }
}