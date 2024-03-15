package com.udemy.courses.javadesignpatterns.structural.decorator;

public class EnhancedCoffeemachine implements CoffeeMachine {

    private NormalCoffeeMachine machine;

    public EnhancedCoffeemachine(NormalCoffeeMachine machine) {
        this.machine = machine;
    }

    // Override behaviour
    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine: Making small coffee");
    }

    // Unaltered behaviour

    @Override
    public void makeLargeCoffee() {
        machine.makeLargeCoffee();
    }

    // Extended behaviour

    public void makeMilkCoffee() {
        System.out.println("Enhanced coffee machine: Making milk coffee");
        machine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: Adding milk");
    }
}
