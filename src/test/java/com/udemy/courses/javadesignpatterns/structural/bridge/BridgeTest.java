package com.udemy.courses.javadesignpatterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeTest {

    @Test
    void testClient() {
        App app1 = new Facebook(new IOS());
        App app2 = new Instagram(new Android());

        app1.runApp();
        app2.runApp();

        assertEquals(1,1);
    }

}