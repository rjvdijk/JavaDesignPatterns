package com.udemy.courses.javadesignpatterns.creational.singleton;

import com.udemy.courses.javadesignpatterns.creational.singleton.SingletonStaticBlock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonStaticBlockTest {

    @Test
    void getInstance() {
        SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock instance2 = SingletonStaticBlock.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);

        assertEquals(instance1, instance2);
    }

}