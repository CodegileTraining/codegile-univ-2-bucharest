package com.codegile.univ.daniel.week1.day1.problem4;

import com.codegile.univ.daniel.week1.day1.utils.FileReader;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        int nrOfWords = 0;
        List<String> contentOfFileAsStringList;
        FileReader fr = new FileReader();

        contentOfFileAsStringList = fr.stringListOfFile("web.html");

        for (int i = 0; i < contentOfFileAsStringList.size(); i++) {
            String word = contentOfFileAsStringList.get(i).toLowerCase();
            for (int j = 0; j < word.length(); j++) {
                if ("b".contains(word)) {
                    count++;
                }
            }
            if (count == 2 && "a".contains(word)) {
                nrOfWords++;
            }
            word = word.replaceAll("\\<p>", "<span>");
            word = word.replaceAll("\\</p>", "</span>");
            contentOfFileAsStringList.set(i, word);

        }
        System.out.printf("Numbers of words with a and 2 of b: " + nrOfWords);
        System.out.printf("\n");
        try
                (FileOutputStream fos = new FileOutputStream("outputweb.html");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(contentOfFileAsStringList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Content of file with tags changed: " + contentOfFileAsStringList);
    }
}

