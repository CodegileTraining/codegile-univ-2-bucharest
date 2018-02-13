package com.codegile.univ.daniel.week1.day1.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {
    private List<String> contentList = new ArrayList<>();

    public List<String> stringArrayOfFile(String fileName) {
        String[] contentOfFileAsStringArray;

        try (
                InputStream is = ClassLoader.getSystemResourceAsStream(fileName);
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
                this.contentList.addAll(Arrays.asList(contentOfFileAsStringArray));
            }
            System.out.printf("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.contentList;
    }
}
