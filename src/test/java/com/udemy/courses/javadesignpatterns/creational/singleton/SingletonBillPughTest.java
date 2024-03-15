package com.udemy.courses.javadesignpatterns.creational.singleton;

import com.udemy.courses.javadesignpatterns.creational.singleton.SingletonBillPugh;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonBillPughTest {

    @Test
    void getInstance() {
        SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh instance2 = SingletonBillPugh.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        assertEquals(instance1, instance2);
    }
}