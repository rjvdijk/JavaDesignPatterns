package com.udemy.courses.javadesignpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterTest {

    @Test
    void testClient() {
        DatabaseDataGenerator generator = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(generator.generateData());

        for (DisplayData3rdParty datum : legacyData) {
            datum.displayData();
        }
        assertEquals(1,1);
    }

}