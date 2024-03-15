package com.udemy.courses.javadesignpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FighterFactory {

    static Map<FighterRank, Fighter> fighters = new HashMap<>();

    public static Fighter getFighter(FighterRank rank) {
        return fighters.computeIfAbsent(rank, Fighter::new);
    }

}
