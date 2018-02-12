package com.codegile.univ.dragos.week1.day1.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        int floats = 0;
        int integers = 0;
        String currentLine;

        try (
                InputStream is = ClassLoader.getSystemResourceAsStream("numbers.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is))
        ) {
            while ((currentLine = br.readLine()) != null) {
                String[] lineStrings = currentLine.split(" ");
                for (String currentValue : lineStrings) {
                    if (isInt(currentValue)) {
                        integers++;
                    }
                    if (isFloat(currentValue)) {
                        floats++;
                    }
                }
            }

            System.out.println("Integers length :" + integers);
            System.out.println("Floats length :" + floats);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private static boolean isInt(String s) {

        try {

            Integer.parseInt(s);
            return true;

        } catch (NumberFormatException e) {

            return false;
        }
    }

    private static boolean isFloat(String s) {

        try {

            Float.parseFloat(s);
            return true;

        } catch (NumberFormatException e) {

            return false;

        } catch (NullPointerException e) {

            return false;
        }
    }
}
