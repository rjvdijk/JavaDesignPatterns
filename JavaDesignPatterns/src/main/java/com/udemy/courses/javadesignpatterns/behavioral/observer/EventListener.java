package com.udemy.courses.javadesignpatterns.behavioral.observer;

public interface EventListener {
    void notify(String eventType, String file);
}
