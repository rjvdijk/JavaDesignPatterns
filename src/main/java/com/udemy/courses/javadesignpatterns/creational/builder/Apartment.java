package com.udemy.courses.javadesignpatterns.creational.builder;

import java.util.Objects;

public class Apartment {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    public Apartment(int sqm, int rooms, String city, String area, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }

    public int getSqm() {
        return sqm;
    }

    // All other getters

    public void display() {
        System.out.println("Apartment has:");
        if (sqm != -1) {
            System.out.println(sqm + " sqm");
        }
        if (rooms != 1) {
            System.out.println(rooms + " rooms");
        }
        if (!"".equals(city)) {
            System.out.println("Apartment is in " + city);
        }
        if (!"".equals(area)) {
            System.out.println("Apartment is in " + area);
        }
        if (kitchen) {
            System.out.println("Apartment has a kitchen");
        }
        System.out.println();
    }
}
