package com.codegile.univ.dragos.week1.day1.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Problem3 {

    public static void main(String args[]) {

        try (InputStream is = ClassLoader.getSystemResourceAsStream("lexicograficwords.txt");
             BufferedReader bf = new BufferedReader(new InputStreamReader(is));) {
            String line;

            while ((line = bf.readLine()) != null) {

            }

        } catch (IOException e) {

        }
    }
}
