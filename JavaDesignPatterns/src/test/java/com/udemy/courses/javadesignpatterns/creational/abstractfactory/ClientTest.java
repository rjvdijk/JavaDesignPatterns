package com.udemy.courses.javadesignpatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

class ClientTest {

    @Test
    void communicate() {
        Client client1 = new Client(new DatabaseFactory());
        client1.communicate();

        Client client2 = new Client(new NetworkFactory());
        client2.communicate();
    }
}