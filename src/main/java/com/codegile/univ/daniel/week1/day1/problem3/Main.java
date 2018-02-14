package com.codegile.univ.daniel.week1.day1.problem3;

import com.codegile.univ.daniel.week1.day1.utils.FileReader;

import java.util.Collections;
import java.util.List;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {

        List<String> contentOfFileAsStringList;
        FileReader fr = new FileReader();

        contentOfFileAsStringList = fr.stringListOfFile("file.txt");
        Collections.sort(contentOfFileAsStringList);

        System.out.println("This is the sorted content: " + contentOfFileAsStringList);

        for (int i = 0; i < contentOfFileAsStringList.size(); i++) {
            String word = contentOfFileAsStringList.get(i).toLowerCase();
            if ("aeiou".indexOf(word.charAt(0)) != -1) {
              int nrOfLetters = word.length();
                String stringNrOfLetters = String.valueOf(nrOfLetters);
                contentOfFileAsStringList.set(i, stringNrOfLetters);
            }
        }
        System.out.println("This is the final sorted content: " + contentOfFileAsStringList);
    }
}
