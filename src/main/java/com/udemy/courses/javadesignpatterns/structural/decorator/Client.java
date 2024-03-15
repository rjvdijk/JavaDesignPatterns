package com.udemy.courses.javadesignpatterns.structural.decorator;

class Client {

    public static void main(String[] args) {
        NormalCoffeeMachine normal = new NormalCoffeeMachine();
        EnhancedCoffeemachine enhanced = new EnhancedCoffeemachine(normal);

        normal.makeSmallCoffee();
        normal.makeLargeCoffee();
        enhanced.makeSmallCoffee();
        enhanced.makeLargeCoffee();
        enhanced.makeMilkCoffee();
    }

}