package com.udemy.courses.javadesignpatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FacadeTest {

    @Test
    void testClient() {
        NetworkAccessFacade facade = new NetworkAccessFacade();
        facade.communicate();

        assertEquals(1,1);
    }

}