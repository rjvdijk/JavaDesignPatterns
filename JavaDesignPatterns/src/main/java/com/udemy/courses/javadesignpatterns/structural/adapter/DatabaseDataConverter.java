package com.udemy.courses.javadesignpatterns.structural.adapter;

import java.util.List;

public interface DatabaseDataConverter {

    public List<DisplayData3rdParty> convertData(List<DatabaseData> data);

}
