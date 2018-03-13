package com.codegile.univ.paul.week5.day2.problems;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
//        runCountDownLatchExample();
        runSemaphoreExample();
    }

    /**
     * CountDownLatch Example
     **/

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    private static void runCountDownLatchExample() {
        new Thread(new Horse("Gigel")).start();
        sleep(1500);
        new Thread(new Horse("Dorel")).start();
        sleep(1000);
        new Thread(new Horse("Purcel")).start();
        new Thread(new Horse("horse1")).start();
        sleep(2000);
        new Thread(new Horse("horse2")).start();
        sleep(1000);

        System.out.println("race starts in ");
        sleep(500);
        System.out.println(3);
        sleep(1000);
        System.out.println(2);
        sleep(1000);
        System.out.println(1);
        sleep(1000);
        System.out.println("GO");
        countDownLatch.countDown();
    }

    static class Horse implements Runnable {

        private String name;

        Horse(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is ready");
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " is running");
        }
    }

    /**
     * Semaphore Example
     **/

    private static Semaphore semaphore = new Semaphore(3, true);

    private static void runSemaphoreExample() throws InterruptedException {
        Car redCar = new Car("red");
        Car blueCar = new Car("blue");
        Car yellowCar = new Car("yellow");
        Car pinkCar = new Car("pink");
        Car blackCar = new Car("black");

        redCar.start();
        sleep(1000);
        blueCar.start();
        sleep(2000);
        yellowCar.start();
        pinkCar.start();
        blackCar.start();

        sleep(3000);
        redCar.leave();
        sleep(2000);
        blueCar.leave();
    }

    private static class Car extends Thread {

        private String color;

        Car(String color) {
            this.color = color;
        }

        void park() throws InterruptedException {
            System.out.println("The " + color + " car wants to park");
            semaphore.acquire();
            System.out.println("The " + color + " car is parked");
        }

        void leave() {
            System.out.println("The " + color + " car is leaving");
            semaphore.release();
        }

        @Override
        public void run() {
            try {
                park();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
