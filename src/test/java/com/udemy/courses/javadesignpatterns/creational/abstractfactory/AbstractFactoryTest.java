package com.udemy.courses.javadesignpatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractFactoryTest {

    @Test
    void testClient() {
        Client client1 = new Client(new DatabaseFactory());
        client1.communicate();

        Client client2 = new Client(new NetworkFactory());
        client2.communicate();

        assertEquals(1,1);
    }
}