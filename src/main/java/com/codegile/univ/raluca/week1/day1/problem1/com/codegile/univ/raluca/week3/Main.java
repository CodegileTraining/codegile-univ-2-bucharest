package com.codegile.univ.raluca.week1.day1.problem1.com.codegile.univ.raluca.week3;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list = new CustomList<>();
        list.add(" 23");
        list.add("326");
        list.add("3211");
        list.add("21");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1, "253");
        System.out.println(list.subList(1, 3));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.clear();
        System.out.println(list);

    }
}
