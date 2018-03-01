package com.codegile.univ.raluca.week1.day1.problem1.com.codegile.univ.raluca.week3;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list = new CustomList<>();
        list.add(" 23");
        list.add("326");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.clear();
        System.out.println(list);

    }
}
