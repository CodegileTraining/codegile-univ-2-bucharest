package com.codegile.univ.daniel.week1.day1.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int nrOfInt = 0;
        int nrOfReal = 0;
        try (
                InputStream is = ClassLoader.getSystemResourceAsStream("file.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String contentOfFile;
            while ((contentOfFile = br.readLine()) != null) {
                String[] contentOfFileAsStringArray = contentOfFile.split(" ");
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
                System.out.println("File content: " + contentOfFile);
                System.out.println("\n");
                System.out.println("Number of integers: " + nrOfInt);
                System.out.println("Number of doubles: " + nrOfReal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
