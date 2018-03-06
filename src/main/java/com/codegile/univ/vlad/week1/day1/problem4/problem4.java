package com.codegile.univ.vlad.week1.day1.problem4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class problem4 {
    public static void main(String[] args) {
        try (InputStream is = ClassLoader.getSystemResourceAsStream("htmlvalid.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String line;

            int wordCount = 0; // TODO: Find a better name for this variable
            List<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
            replace(lines, "<p>", "<span>");
            replace(lines, "</p>", "</span>");
            writeToFile("src/main/resources/htmlvalid.txt", lines);
            for (String linie : lines) {
                String[] array = linie.split(" +");
                for (String word : array) {
                    if (word.matches("((a*ba*ba*)+|a+)")) {
                        wordCount++;
                    }
                }
            }
            System.out.println("Numarul de cuvinte cautate este: " + wordCount);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String filePath, List<String> lines) {
        File fileToBeModified = new File(filePath);
        try (FileWriter writer = new FileWriter(fileToBeModified)) {
            for (String line : lines) {
                writer.append(line)
                        .append("\n");

                //writer.write(line);
                    writer.write("\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void replace(List<String> list, String oldString, String newString) {

        for (int i = 0; i < list.size(); i++) {
            String replacedString = list.get(i);
            replacedString = replacedString.replaceAll(oldString, newString);
            list.set(i, replacedString);
        }
    }
}
