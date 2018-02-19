package com.codegile.univ.andrei.week1.day1.problem1;

import java.util.List;

import com.codegile.univ.andrei.week1.day1.fileservice.FileService;

public class Main {

    public static void main(String[] args) {

        int floats = 0;
        int integers = 0;
        FileService fs = new FileService();
        List<String> fileContent = fs.readFromFile("input.txt");

        for (String currentValue : fileContent) {
            if (isInt(currentValue)) {
                integers++;
            }
            if (isFloat(currentValue)) {
                floats++;
            }
        }

        System.out.println("Integers :" + integers);
        System.out.println("Doubles :" + floats);
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);

            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }

    private static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);

            return true;
        } catch (NumberFormatException n) {
            return false;
        }
    }
}
