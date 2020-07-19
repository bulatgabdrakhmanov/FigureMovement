package ru.bulat.figuremovement.utils;

import java.util.Random;

public class Helper {
    public static int getRandomFromRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random(System.currentTimeMillis());
        return r.nextInt((max - min) + 1) + min;
    }
}