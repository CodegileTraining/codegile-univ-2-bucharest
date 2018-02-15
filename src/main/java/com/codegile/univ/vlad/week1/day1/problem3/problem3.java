package com.codegile.univ.vlad.week1.day1.problem3;

// TODO: Always remove useless imports

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class problem3 {
    public static void main(String[] args) {

        try (InputStream is = ClassLoader.getSystemResourceAsStream("stringuri.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            int letterCount = 0; // TODO: Use English for variable names (letterCount)
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] array = line.split(" ");
                List<String> list = new ArrayList<>(); // TODO: Declare as interface and use generics (List<String> list = new ArrayList<>())
                Collections.addAll(list, array);
                Collections.sort(list);
                System.out.println(list);
                for (String word : array) {
                    String firstLetter = word.substring(0, 1);
                    if ("aeiouAEIOU".contains(firstLetter)) {
                        letterCount = word.length();
                        // TODO: You should print all the words, but replace the ones starting with a vowel (and don't print the word in that case)
                        System.out.println(letterCount);
                    } else {
                        System.out.println(word);
                    }
                }

                letterCount = 0;

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

