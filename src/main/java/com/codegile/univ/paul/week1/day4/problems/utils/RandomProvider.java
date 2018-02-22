package com.codegile.univ.paul.week1.day4.problems.utils;

import java.util.Random;

public final class RandomProvider {
    private static Random random=new Random();

    public static boolean getNextBoolean(){
        return random.nextBoolean();
    }

    public static int getNextInt(int number){
        return random.nextInt(number);
    }

}
