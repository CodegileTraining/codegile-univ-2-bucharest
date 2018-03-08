package com.codegile.univ.com.codegile.univ.raluca.week4;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> maps = new CustomMap<>(5);
        maps.put(1, "bla");
        maps.put(2, "tra");
        maps.put(3, "lal");
        maps.put(4, "trst");
        maps.remove(2);
        maps.put(5, "deee");
        System.out.println(maps);

    }
}
