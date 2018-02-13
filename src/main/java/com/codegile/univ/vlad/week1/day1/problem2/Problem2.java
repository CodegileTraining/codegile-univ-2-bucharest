package com.codegile.univ.vlad.week1.day1.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.PatternSyntaxException;

public class Problem2 {
    public static void main(String[] args) {

        int numberIdealNames = 0;
        int a = 1;
        try (InputStream is = ClassLoader.getSystemResourceAsStream("words.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                line = eliminateDots(line);
                line = eliminateCommas(line);
                line = line.replaceAll("\\?", "");
                line = line.replaceAll("!", "");
                String[] array = line.split(" ");
                for (String word : array) {
                    boolean isIdealWord = true;
                    boolean isUpperCase = Character.isUpperCase(word.charAt(0));
                    if (isUpperCase == true) {
                        for (int j = 1; j <= word.length() - 1; j++) {
                            char ch = word.charAt(j);
                            if (Character.isLowerCase(ch) == false) {
                                isIdealWord = false;
                                break;
                            }
                        }
                        if (isIdealWord){
                            numberIdealNames++;
                            System.out.println(word);
                    }

                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(numberIdealNames);
    }


    private static String eliminateDots(String string) {
        try {
            string = string.replaceAll("\\.", "");
        } catch (PatternSyntaxException e) {

        }
        return string;
    }

    private static String eliminateCommas(String string) {
        try {
            string = string.replaceAll(",", "");
        } catch (PatternSyntaxException e) {

        }
        return string;
    }

}
