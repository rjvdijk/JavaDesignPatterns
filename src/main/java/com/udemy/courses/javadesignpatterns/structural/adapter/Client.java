package com.udemy.courses.javadesignpatterns.structural.adapter;

import java.util.List;

class Client {

    public static void main(String[] args) {
        DatabaseDataGenerator generator = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(generator.generateData());

        for (DisplayData3rdParty datum : legacyData) {
            datum.displayData();
        }
    }

}