package com.codegile.univ.daniel.week1.day1.problem2;

import java.util.List;

import com.codegile.univ.daniel.week1.day1.utils.FileReader;

public class Main {

    public static void main(String[] args) {
        List<String> contentOfFileAsStringList;
        int nrOfIdealWords = 0;
        FileReader fr = new FileReader();
        contentOfFileAsStringList = fr.stringListOfFile("file.txt");
        for (String word : contentOfFileAsStringList) {
            boolean isUpperCase = Character.isUpperCase(word.charAt(0));
            if (!isUpperCase) {
                continue;
            }
            char[] chars = word.toCharArray();
            boolean ok = true;
            for (int i = 1; i < chars.length; i++) {
                boolean isLowerCase = Character.isLowerCase(chars[i]);
                if (!isLowerCase) {
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                System.out.printf("\n");
                System.out.printf("The word " + word + " has first uppercase letter but it's not an ideal word");
            } else {
                nrOfIdealWords++;
            }
        }
        System.out.printf("\n");
        System.out.printf("Number of ideal words:" + nrOfIdealWords);
    }
}

