package com.codegile.univ.vlad.week1.day1.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class problem4 {
    public static void main(String[] args) {
        try (InputStream is = ClassLoader.getSystemResourceAsStream("htmlvalid.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            int cuvintea2bCount = 0; // TODO: Find a better name for this variable
            int bCount = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                line = line.replaceAll("<p>", "<span>")
                        .replaceAll("</p", "</span>"); // TODO: You have to replace the tags in the file (write to the file)
                String[] array = line.split(" ");
                for (String word : array) {
                    for (int i = 0; i <= word.length() - 1; i++) {
                        if (word.charAt(i) == 'a' || word.charAt(i) == 'b') { // TODO: Try to find a solution using RegEx
                            if (word.charAt(i) == 'b') {
                                bCount++;
                            }
                        } else break;
                    }
                    if (bCount % 2 == 0 && bCount >1) { // TODO: Why must there be at least 1 letter B?
                        cuvintea2bCount++;
                        System.out.println(word);
                    }
                    bCount=0;
                }
                System.out.println("Numarul de cuvinte cautate este: "+cuvintea2bCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
