package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public class RandomGenerator {

    private static Random randomGenerator = new Random(System.currentTimeMillis());

    public static int getInt(int number) {
        return randomGenerator.nextInt(number);
    }

    public static boolean getNextBoolean() {
        return randomGenerator.nextBoolean();
    }
}
