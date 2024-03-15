package com.udemy.courses.javadesignpatterns.creational.builder;

// Variatie op thema Builder, nu met static inner Builder class

public class Apartment2 {
    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean kitchen;

    private Apartment2(int sqm, int rooms, String city, String area, boolean kitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.kitchen = kitchen;
    }

    public static Apartment2Builder builder() {
        return new Apartment2Builder();
    }

    public static class Apartment2Builder {
        private int sqm = -1;
        private int rooms = -1;
        private String city = "";
        private String area = "";
        private boolean kitchen = false;

        public Apartment2Builder setSqm(int sqm) {
            this.sqm = sqm;
            return this;
        }

        public Apartment2Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Apartment2Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Apartment2Builder setArea(String area) {
            this.area = area;
            return this;
        }

        public Apartment2Builder setKitchen(boolean kitchen) {
            this.kitchen = kitchen;
            return this;
        }

        public Apartment2 build() {
            return new Apartment2(sqm, rooms, city, area, kitchen);
        }

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
