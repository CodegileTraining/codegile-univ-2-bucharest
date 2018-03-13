package com.codegile.univ.paul.week5.day2.problems;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
//        runExample1();
//        runExample2();
//        runExample3();
//        runExample4();
//        runExample41();
    }

    private static void runExample41() {
        Thread thread = new Thread(() -> {
            System.out.println("I started");
            sleepWithInterrupt(3000);
            if (!Thread.currentThread().isInterrupted()) {
                System.out.println("I finished");
            } else {
                System.out.println("I was interrupted");
            }
        });

        thread.start();
        sleep(1000);
        thread.interrupt();
    }

    private static void runExample4() {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        singleExecutor.submit(() -> {
            System.out.println("I started");
            sleepWithInterrupt(3000);
            if (!Thread.currentThread().isInterrupted()) {
                System.out.println("I finished");
            } else {
                System.out.println("I was interrupted");
            }
        });

        singleExecutor.shutdownNow();
    }

    private static void sleepWithInterrupt(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void runExample3() {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        Future<String> future = singleExecutor.submit(() -> {
            System.out.println("I started");
            sleep(3000);
            System.out.println("I finished");
            return "Hello";
        });
        singleExecutor.shutdown();

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void runExample2() {
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(3);
        ExecutorService cachedExecutor = Executors.newCachedThreadPool();

        testExecutor(fixedExecutor);
    }

    private static void testExecutor(ExecutorService executor) {
        executor.submit(() -> {
            System.out.println("First thread running");
            sleep(1000);
            System.out.println("First thread finished (" + Thread.currentThread().getId() + ")");
        });
        executor.submit(() -> {
            System.out.println("Second thread running");
            sleep(1000);
            System.out.println("Second thread finished (" + Thread.currentThread().getId() + ")");
        });
        executor.submit(() -> {
            System.out.println("Third thread running");
            sleep(1000);
            System.out.println("Third thread finished (" + Thread.currentThread().getId() + ")");
        });
        executor.submit(() -> {
            System.out.println("Fourth thread running");
            sleep(1000);
            System.out.println("Fourth thread finished (" + Thread.currentThread().getId() + ")");
        });
        executor.submit(() -> {
            System.out.println("Fifth thread running");
            sleep(1000);
            System.out.println("Fifth thread finished (" + Thread.currentThread().getId() + ")");
        });
        System.out.println("executor shutting down");
        executor.shutdown();
    }

    private static void runExample1() {
        Thread thread = new Thread(() -> {
            sleep(1000);
            System.out.println("DB has been updated");
        });

        Thread thread2 = new Thread(() -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 continues");
        });

        thread.start();
        thread2.start();}
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }
}