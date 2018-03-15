package com.codegile.univ.com.codegile.univ.raluca.week5;

public class RunnableDemo implements Runnable {

    private Thread thread;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println("Hello from Thread " + threadName);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    public void start() {
        if (thread == null) {
            thread = new Thread();
        }
    }
}
