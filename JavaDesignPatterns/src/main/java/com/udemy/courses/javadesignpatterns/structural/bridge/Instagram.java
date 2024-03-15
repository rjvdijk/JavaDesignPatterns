package com.udemy.courses.javadesignpatterns.structural.bridge;

public class Instagram implements App {

    PhoneOS os;

    public Instagram(PhoneOS os) {
        this.os = os;
    }

    @Override
    public void runApp() {
        System.out.println();
        os.display("Cached data");
        os.upload("instagram.com");
        os.display("instagram data");
        os.display("fresh data");
        System.out.println();
    }
}
