package com.codegile.univ.vlad.week1.day1.problem3;

// TODO: Always remove useless imports
import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class problem3 {
    public static void main(String[] args) {

        try (InputStream is = ClassLoader.getSystemResourceAsStream("stringuri.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            int numarLitere = 0; // TODO: Use English for variable names (letterCount)
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] array = line.split(" ");
                ArrayList lista = new ArrayList(); // TODO: Declare as interface and use generics (List<String> list = new ArrayList<>())
                for (String word : array) { // TODO: Investigate warning on the 'for'
                    lista.add(word);
                }
                Collections.sort(lista);
                System.out.println(lista);
                for (String word : array) {
                    String firstLetter = word.substring(0, 1);
                    if ("aeiouAEIOU".contains(firstLetter)) {
                        for (int i = 0; i < word.length(); i++) { // TODO: Why are you manually counting the letters?
                            numarLitere++;
                        }
                        System.out.println(word); // TODO: You should print all the words, but replace the ones starting with a vowel (and don't print the word in that case)
                        System.out.println(numarLitere);
                    }

                    numarLitere = 0;

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
