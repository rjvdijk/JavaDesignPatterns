package com.udemy.courses.javadesignpatterns.creational.abstractfactory;

public class NetworkResponse implements Response {
    @Override
    public String getResponse() {
        return "Network response";
    }
}
