package com.codegile.univ.daniel.week1.day1.problem1;

import java.io.*;
import java.util.List;

import com.codegile.univ.daniel.week1.day1.utils.FileReader;

public class Main {

    public static void main(String[] args) {
        int nrOfInt = 0;
        int nrOfReal = 0;
        List<String> contentOfFileAsStringArray;
        FileReader fr = new FileReader();
        contentOfFileAsStringArray = fr.stringArrayOfFile("file.txt");
        for (String s : contentOfFileAsStringArray) {
            if (isNumeric(s)) {
                nrOfReal++;
                try {
                    Integer.parseInt(s);
                    nrOfInt++;
                } catch (NumberFormatException ignored) {
                }
            }
        }
        System.out.println("\n");
        System.out.println("Number of integers: " + nrOfInt);
        System.out.println("Number of doubles: " + nrOfReal);
    }


    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}