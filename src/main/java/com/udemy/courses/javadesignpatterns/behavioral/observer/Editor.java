package com.udemy.courses.javadesignpatterns.behavioral.observer;

public class Editor {

    public EventManager events = new EventManager("open", "save");
    String file = "";

    void openFile(String filename) {
        this.file = filename;
        events.notify("open", file);
    }

    void saveFile() {
        if (!file.isEmpty()) {
            events.notify("save", file);
        }
    }

}
