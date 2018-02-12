package com.codegile.univ.daniel.week1.day1.problem1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException { // TODO: Remove unused throws statement
        int nrOfInt=0; // TODO: Always use CTRL+ALT+L to format your code
        int nrOfReal=0;
        BufferedReader br = null; // TODO: Remove unused initializer.
            InputStream is = ClassLoader.getSystemResourceAsStream("file.txt");
            br = new BufferedReader(new InputStreamReader(is));
            try {
                String x; // TODO: Name your variables in a more explicit way, so that it is easier to read the code
                while ((x = br.readLine()) != null) {
                    String[] y = x.split(" ");
                    for (String s: y)
                    {
                        try{
                        int i = Integer.parseInt(s); // TODO: No need to save the value in a variable - we only care about the exception being thrown
                        nrOfInt++;
                        } catch ( NumberFormatException e) {
                            double d = Double.parseDouble(s); // TODO: Same thing, no need to save value
                            nrOfReal++; // TODO: What happens if the value in s is not an integer or a real number?
                        }
                    }
                    System.out.println("\n");
                    System.out.println("File content: " + x);
                    System.out.println("\n");
                    System.out.println("Number of integers: " +  nrOfInt);
                    System.out.println("Number of doubles: " + nrOfReal); // TODO: Are you sure you counted all the real numbers??
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // TODO: Always close InputStreams and BufferedReaders etc! Use the .close() methods in a finally { } block
    }
}
