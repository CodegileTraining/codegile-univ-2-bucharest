package com.codegile.univ.com.codegile.univ.raluca.week5;

public class Main {
    static int NUM_THREADS = 70;
    public static void main(String[] args) {
        MyThread threads[] = new MyThread[NUM_THREADS];

        for (int i = NUM_THREADS - 1; i >= 0; i--) {
            if (i == NUM_THREADS - 1) {
                threads[i] = new MyThread(null, "Thread" + (i + 1));
            } else {
                threads[i] = new MyThread(threads[i + 1], "Thread" + (i + 1));
            }
        }

        threads[0].start();
    }
}

