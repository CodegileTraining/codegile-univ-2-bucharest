package com.codegile.univ.paul.week5.day2.problems.race;

import java.util.Random;

public class Runner extends Thread {

    private static final Random random = new Random(System.currentTimeMillis());

    private Team team;
    private String name;
    private Runner previousRunner;

    public Runner(Team team, int runnerPosition) {
        this.team = team;
        name = "Runner " + runnerPosition + " from " + team.getTeamName();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is prepared to run");
            Gate.getInstance().countDown();
            Gate.getInstance().await();
            if (previousRunner != null) {
                previousRunner.join();
                //System.out.println("hahaha");
            }
            runTheRace();
            team.runnerFinished();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void runTheRace() {
        try {
            System.out.println(name + " started running");
            long start = System.currentTimeMillis();
            Thread.sleep(random.nextInt(1000) + 1000);
            long end = System.currentTimeMillis();
            System.out.println(name + " finished running in " + (end - start) + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setPreviousRunner(Runner runner) {
        previousRunner = runner;
    }
}
