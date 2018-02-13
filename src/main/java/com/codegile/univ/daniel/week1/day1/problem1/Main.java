package com.codegile.univ.daniel.week1.day1.problem1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> contentOfFileAsStringArray;
        int nrOfIdealWords = 0;

        contentOfFileAsStringArray = stringArrayOfFile();
        for (String word : contentOfFileAsStringArray) {
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

    private static List<String> stringArrayOfFile() {
        String[] contentOfFileAsStringArray;
        List<String> contentList = new ArrayList<>();
        try (
                InputStream is = ClassLoader.getSystemResourceAsStream("file.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String contentOfFile;
            while ((contentOfFile = br.readLine()) != null) {
                System.out.printf("\n");
                System.out.printf("Content of file on line: " + contentOfFile);
                contentOfFile = contentOfFile.replaceAll("\\.", "");
                contentOfFile = contentOfFile.replaceAll("\\,", "");
                contentOfFile = contentOfFile.replaceAll("\\!", "");
                contentOfFile = contentOfFile.replaceAll("\\?", "");
                contentOfFile = contentOfFile.replaceAll(" +", " ");
                contentOfFileAsStringArray = contentOfFile.split(" ");
                contentList.addAll(Arrays.asList(contentOfFileAsStringArray));
            }
            System.out.printf("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentList;
    }
}
