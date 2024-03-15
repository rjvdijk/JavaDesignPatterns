package com.udemy.courses.javadesignpatterns.behavioral.state;

public class BreakState extends State {

    public BreakState(Game game) {
        super(game);
        System.out.println("-- Game in Break state --");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("Not allowed");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("Currently on break state");
    }

    @Override
    public void onEnding() {
        System.out.println("Not allowed");
    }
}