package com.udemy.courses.javadesignpatterns.creational.singleton;

import com.udemy.courses.javadesignpatterns.creational.singleton.SingletonThreadSafe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonThreadSafeTest {

    @Test
    void getInstance() {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        assertEquals(instance1, instance2);
    }

}