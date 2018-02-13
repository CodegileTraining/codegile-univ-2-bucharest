package com.codegile.univ.andrei.week1.day1.problem3;

import com.codegile.univ.andrei.week1.day1.fileservice.FileService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();
        List<String> processedList = new ArrayList<>();

        List<String> fileContent = fs.readFromFile("input.txt");
        for(String word: fileContent){
            word = word.replaceAll("\\.", "")
                    .replaceAll("\\,", "")
                    .replaceAll("\\?", "");
            processedList.add(word);
        }
        processedList.sort(String::compareTo);

        for(String word: processedList){
            if(startsWithVowel(word)){
                System.out.println(word.length());
            }else{
                System.out.println(word);
            }
        }
    }

    private static boolean startsWithVowel(String word){
        String vowels = "aeiou";
        if (vowels.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
            return true;
        }else{
            return false;
        }
    }
}
