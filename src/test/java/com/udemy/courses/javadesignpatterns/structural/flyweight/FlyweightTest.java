package com.udemy.courses.javadesignpatterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyweightTest {

    @Test
    void testClient() {
        int toDraw = 1000;
        Army army = new Army();
        FighterRank currentRank;
        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    currentRank = FighterRank.PRIVATE;
                    break;
                case 1:
                    currentRank = FighterRank.SERGEANT;
                    break;
                default:
                    currentRank = FighterRank.MAJOR;
                    break;
            }
            army.spawnFighter(currentRank);
        }
        army.drawArmy();

        assertEquals(1,1);
    }

}