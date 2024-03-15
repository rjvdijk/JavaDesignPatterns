package com.udemy.courses.javadesignpatterns.behavioral.memento;

import java.util.ArrayList;

public class Caretaker {

    ArrayList<Memento> mementoList = new ArrayList<>();

    public void saveState(Memento memento) {
        mementoList.add(memento);
    }

    public Memento restoreState(int index) {
        return mementoList.get(index);
    }

}
