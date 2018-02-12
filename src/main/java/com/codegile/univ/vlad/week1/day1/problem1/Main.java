package com.codegile.univ.vlad.week1.day1.problem1;


import java.io.*;

public class Main {

    public static void main(String[] args) {
        int intNumbersCount = 0;
        int realNumbersCount = 0;


        String line;
        try (InputStream is = ClassLoader.getSystemResourceAsStream("numbers.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] array = line.split(" ");

                for (String i : array) {
                    if (isInteger(i)) {
                        intNumbersCount++;
                    }
                    if (isReal(i)) {
                        realNumbersCount++;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Integer numbers: " + intNumbersCount);
        System.out.println("Real numbers: " + realNumbersCount);
    }

    private static boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    private static boolean isReal(String string) {
        try {
            Float.parseFloat(string);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}