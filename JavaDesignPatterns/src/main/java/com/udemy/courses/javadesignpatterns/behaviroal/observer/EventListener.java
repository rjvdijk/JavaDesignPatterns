package com.udemy.courses.javadesignpatterns.behaviroal.observer;

public interface EventListener {
    void notify(String eventType, String file);
}
