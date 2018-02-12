package com.codegile.univ.daniel.week1.day1.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        int nrOfInt = 0;
        int nrOfReal = 0;
        InputStream is = ClassLoader.getSystemResourceAsStream("file.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {
            String contentOfFile;
            while ((contentOfFile = br.readLine()) != null) {
                String[] contentOfFileAsStringArray = contentOfFile.split(" ");
                for (String s : contentOfFileAsStringArray) {
                    if (isNumeric(s) == true) {
                        try {
                            Integer.parseInt(s);
                            nrOfInt++;
                        } catch (NumberFormatException e) {
                            Float.parseFloat(s);
                            nrOfReal++;
                        }
                    }
                }
                int allRealNumbers = nrOfReal + nrOfInt;
                System.out.println("\n");
                System.out.println("File content: " + contentOfFile);
                System.out.println("\n");
                System.out.println("Number of integers: " + nrOfInt);
                System.out.println("Number of doubles: " + allRealNumbers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                is.close();
            } catch (IOException ignored) {
            }  // I've done it like this because without try catch it trows an error:
            // 'unhandled exception java.io.exception'
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
