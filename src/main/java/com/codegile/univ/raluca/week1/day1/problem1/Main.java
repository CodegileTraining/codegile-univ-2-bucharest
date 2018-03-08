package com.codegile.univ.raluca.week1.day1.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (InputStream is = ClassLoader.getSystemResourceAsStream("text.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;

            while ((line= br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
