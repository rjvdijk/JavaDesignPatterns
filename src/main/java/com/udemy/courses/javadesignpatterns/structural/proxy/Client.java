package com.udemy.courses.javadesignpatterns.structural.proxy;

class Client {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println();
        image.display();
    }

}