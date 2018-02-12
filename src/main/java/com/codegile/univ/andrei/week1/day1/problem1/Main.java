package com.codegile.univ.andrei.week1.day1.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        InputStream is;
        is = ClassLoader.getSystemResourceAsStream("input.txt");
        int floats = 0;
        int integers = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] lineStrings = sCurrentLine.split(" ");
                for (String currentValue : lineStrings) {
                    if (isInt(currentValue)) {
                        integers++;
                    }
                    if (isFloat(currentValue)) {
                        floats++;
                    }
                }
            }

            System.out.println("Integers :" + integers);
            System.out.println("Doubles :" + floats);

        } catch (IOException e) {
            e.printStackTrace();
        }
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
