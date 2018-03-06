package com.codegile.univ.paul.week1.day4.problems;

import java.util.Random;

public class RandomGenerator {

    private static Random randomGenerator = new Random(System.currentTimeMillis());

    public static int getInt() {
        return randomGenerator.nextInt();
    }
}
