package com.udemy.courses.javadesignpatterns.structural.composite;

class Client {

    public static void main(String[] args) {
        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("Processor", 1000);
        Equipment hdd = new Equipment("Hard drive", 250);
        Composite memory = new Composite("Memory");
        Equipment rom = new Equipment("Read Only Memory", 75);
        Equipment ram = new Equipment("Random Access Memory", 100);

        memory.add(rom).add(ram);
        computer.add(processor).add(hdd).add(memory);
        System.out.println("PC price: " + computer.getPrice());
    }

}