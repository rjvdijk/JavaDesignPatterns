package com.udemy.courses.javadesignpatterns.structural.facade;

class Client {

    public static void main(String[] args) {
        NetworkAccessFacade facade = new NetworkAccessFacade();
        facade.communicate();
    }

}