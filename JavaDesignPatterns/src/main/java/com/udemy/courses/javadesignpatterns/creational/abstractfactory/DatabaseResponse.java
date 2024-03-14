package com.udemy.courses.javadesignpatterns.creational.abstractfactory;

public class DatabaseResponse implements Response {
    @Override
    public String getResponse() {
        return "Database response";
    }
}
