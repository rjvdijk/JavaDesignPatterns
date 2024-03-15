package com.udemy.courses.javadesignpatterns.creational.singleton;

import com.udemy.courses.javadesignpatterns.creational.singleton.SingletonLazy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyTest {

    @Test
    void getInstance() {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        assertEquals(instance1, instance2);
    }

}