package com.codegile.univ.andrei.week1.day1.problem1;


import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        BufferedReader br = null;
        InputStream is = null;
        int floats = 0;
        int integers = 0;

        try {
            is = ClassLoader.getSystemResourceAsStream("input.txt");
            br = new BufferedReader(new InputStreamReader(is));

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] lineStrings = sCurrentLine.split(" ");
                for (int i = 0; i < lineStrings.length; i++) {
                    if (isInt(lineStrings[i])) {
                        integers++;
                    }
                    if (isFloat(lineStrings[i])) {
                        floats++;
                    }
                }
            }

            System.out.println("Integers :" + integers);
            System.out.println("Doubles :" + floats);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (is != null)
                    is.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
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
