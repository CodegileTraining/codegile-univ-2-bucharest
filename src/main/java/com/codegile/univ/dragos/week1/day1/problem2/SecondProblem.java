package com.codegile.univ.dragos.week1.day1.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondProblem {
    public static void main(String args[]) {

        int idealNumbersLength = 0;

        try (InputStream is = ClassLoader.getSystemResourceAsStream("IdealWordsInPaulOpinion.txt");
             BufferedReader bf = new BufferedReader(new InputStreamReader(is))) {

            String line;
            while ((line = bf.readLine()) != null) {
                line = line.replaceAll("\\.", "");
                line = line.replaceAll(",", "");
                line = line.replaceAll("\\?", "");
                line = line.replaceAll("!", "");

                List<String> words  = Arrays.asList(line.split(" "));

                idealNumbersLength += getIdealCount(words);
            }
            System.out.println("There are " + idealNumbersLength + " elements that starts with uppercase.");
        } catch (IOException e) {
            System.out.println("Exception: " + e + " found.");
        }
    }

    public static int getIdealCount(List<String> words) {
        int idealCount = 0;
        for (String word : words) {
            if (isIdealWord(word)) {
                idealCount++;
            }
        }
        return idealCount;
    }

    public static boolean isIdealWord(String word) {
        Character firstCharacter = word.charAt(0);
        if (Character.isLowerCase(firstCharacter) || Character.isDigit(firstCharacter)) {
            return false;
        }
        for (int i = 1; i <= word.length() - 1; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
