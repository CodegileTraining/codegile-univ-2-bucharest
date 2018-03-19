package com.codegile.univ.paul.week5.day2.problems.race;

import java.util.concurrent.CountDownLatch;

public class Gate {

    private static Gate INSTANCE;

    private CountDownLatch countDownLatch;

    private Gate() {
        countDownLatch = new CountDownLatch(1);
    }

    public static Gate getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Gate();
        }
        return INSTANCE;
    }

    public void countDown() {
        countDownLatch.countDown();
    }

    public void await() {
        try {
            countDownLatch.await();
            System.out.println("hahaha");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
