package com.udemy.courses.javadesignpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProxyTest {

    @Test
    void testClient() {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println();
        image.display();

        assertEquals(1,1);
    }

}