package com.udemy.courses.javadesignpatterns.creational.abstractfactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
