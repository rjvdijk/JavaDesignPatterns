package com.udemy.courses.javadesignpatterns.creational.builder;

import org.junit.jupiter.api.Test;

class ApartmentBuilderTest {

    @Test
    void testBuilder() {
        ApartmentBuilder builder = new ApartmentBuilder();
        Apartment ap1 = builder
                .setSqm(25)
                .setRooms(2)
                .setCity("London")
                .setArea("Kensington")
                .setKitchen(true)
                .build();
        ap1.display();

        Apartment ap2 = builder
                .setRooms(3)
                .setCity("Paris")
                .build();
        ap2.display();
    }

}