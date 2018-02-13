package com.codegile.univ.andrei.week1.day1.fileservice;

import jdk.nashorn.api.tree.RegExpLiteralTree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private List<String> content = new ArrayList<>();

    public List<String> readFromFile(String fileName) {

        try (
                InputStream is = ClassLoader.getSystemResourceAsStream(fileName);
                BufferedReader br = new BufferedReader(new InputStreamReader(is))
        ) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                String[] lineStrings = sCurrentLine.split(" ");
                for (String currentValue : lineStrings) {
                    currentValue = currentValue.replaceAll("\\.","");
                    currentValue = currentValue.replaceAll("\\,","");
                    currentValue = currentValue.replaceAll("\\?","");

                    this.content.add(currentValue);
                }
            }
            return this.content;

        } catch (IOException e) {
            e.printStackTrace();
            return this.content;
        }
    }
}
