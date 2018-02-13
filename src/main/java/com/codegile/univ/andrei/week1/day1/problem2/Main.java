package com.codegile.univ.andrei.week1.day1.problem2;

import com.codegile.univ.andrei.week1.day1.fileservice.FileService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileService fs = new FileService();
        List<String> fileContent;

        fileContent = fs.readFromFile("input.txt");
        for (String word : fileContent) {
            if (isPerfect(word)) {
                System.out.println(word + " is perfect.");
            }
        }
    }

    private static boolean isPerfect(String word) {

        if (!Character.isUpperCase(word.charAt(0))) {
          return false;
        }
        if(word.matches(".*\\d+.*")){
            return false;
        }
        char ch;
        for(int i=1;i < word.length();i++) {
            ch = word.charAt(i);
            if(Character.isAlphabetic(ch)){
                if( Character.isDigit(ch)) {
                    return false;
                }
                else if (Character.isUpperCase(ch)) {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
