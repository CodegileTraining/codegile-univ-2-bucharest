package com.codegile.univ.daniel.week1.day1.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int nrOfInt=0;
        int nrOfReal=0;
        BufferedReader br = null;
            InputStream is = ClassLoader.getSystemResourceAsStream("file.txt");
            br = new BufferedReader(new InputStreamReader(is));
            try {
                String x;
                while ((x = br.readLine()) != null) {
                    String[] y = x.split(" ");
                    for (String s: y)
                    {
                        try{
                        int i = Integer.parseInt(s);
                        nrOfInt++;
                        } catch ( NumberFormatException e) {
                            double d = Double.parseDouble(s);
                            nrOfReal++;
                        }
                    }
                    System.out.println("\n");
                    System.out.println("File content: " + x);
                    System.out.println("\n");
                    System.out.println("Number of integers: " +  nrOfInt);
                    System.out.println("Number of doubles: " + nrOfReal);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
