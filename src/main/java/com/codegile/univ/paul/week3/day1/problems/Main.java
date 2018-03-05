package com.codegile.univ.paul.week3.day1.problems;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stuff stuff1 = new Stuff();
        Stuff stuff2 = new Stuff();
        Stuff stuff3 = new Stuff();
        Stuff stuff4 = new Stuff();
        Stuff stuff5 = new Stuff();

        Set<Stuff> stuffs = new HashSet<>();

        stuffs.add(stuff1);
        stuffs.add(stuff2);
        stuffs.add(stuff3);
        stuffs.add(stuff4);
        stuffs.add(stuff5);

//        System.out.println(stuffs);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "one");

        Map<Integer, String> uniqueMap = new HashMap<>();

        Set<String> uniqueValues = new HashSet<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (uniqueValues.add(entry.getValue())) {
                uniqueMap.put(entry.getKey(), entry.getValue());
            }
        }




        Queue<String> queue = new PriorityQueue<>((s1, s2) -> s2.length() - s1.length());

        queue.offer("abcdef");
        queue.offer("abcdefg");
        queue.offer("abc");
        queue.offer("ablskdfc3");
        queue.offer("ablskdfc2");
        queue.offer("ablskdfc1");
        queue.offer("abz");
        queue.offer("abl");


        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());

        Deque deque = new ArrayDeque();
    }
    // key - value
}
