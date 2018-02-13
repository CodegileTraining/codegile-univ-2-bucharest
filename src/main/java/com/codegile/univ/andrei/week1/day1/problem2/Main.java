package com.codegile.univ.andrei.week1.day1.problem2;

import com.codegile.univ.andrei.week1.day1.fileservice.FileService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileService fs = new FileService();
        int count = 0;

        List<String> fileContent = fs.readFromFile("input.txt");
        for (String word : fileContent) {
            word = word.replaceAll("\\.", "")
                    .replaceAll("\\,", "")
                    .replaceAll("\\?", "");

            if (isPerfect(word)) {
                count++;

            }
        }

        System.out.println("S-au gasit " + count + " cuvinte ideale");
    }

    private static boolean isPerfect(String word) {

        if (!Character.isUpperCase(word.charAt(0))) {
            return false;
        }
        if (word.matches(".*\\d+.*")) {
            return false;
        }
        String aux = word.substring(1);
        for (char ch : aux.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
