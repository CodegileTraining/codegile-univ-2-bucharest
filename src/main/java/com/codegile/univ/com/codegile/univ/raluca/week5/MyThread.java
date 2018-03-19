package com.codegile.univ.com.codegile.univ.raluca.week5;

public class MyThread extends Thread {

    private Thread thread;
    private String threadName;

    public MyThread(Thread thread, String threadName) {
        this.thread = thread;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // wait for next thread finish
        try {
            if (thread != null) {
                thread.start();
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from " + threadName);
    }
}
