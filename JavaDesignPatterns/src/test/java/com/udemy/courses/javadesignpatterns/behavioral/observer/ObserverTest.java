package com.udemy.courses.javadesignpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverTest {

    @Test
    void testClient() {
        Editor editor = new Editor();
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();

        editor.events.subscribe("open", emailNotificationListener);
        editor.events.subscribe("save", emailNotificationListener);
        editor.events.subscribe("open", logOpenListener);

        editor.openFile("test.txt");
        editor.saveFile();

        System.out.println();

        editor.events.unsubscribe("save", emailNotificationListener);

        editor.openFile("test.txt");
        editor.saveFile();

        assertEquals(1,1);
    }

}