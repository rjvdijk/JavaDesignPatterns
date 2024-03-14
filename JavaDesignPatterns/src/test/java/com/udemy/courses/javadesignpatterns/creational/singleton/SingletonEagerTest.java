package com.udemy.courses.javadesignpatterns.creational.singleton;

import com.udemy.courses.javadesignpatterns.creational.singleton.SingletonEager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerTest {

    @Test
    void getInstance() {
        SingletonEager instance1 = SingletonEager.getInstance();
        SingletonEager instance2 = SingletonEager.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        assertEquals(instance1, instance2);
    }

}