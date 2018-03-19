package com.codegile.univ.paul.week5.day2.problems.race;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private static int teamCount = 1;
    private static final int RUNNERS_PER_TEAM = 5;
    private String teamName;
    private List<Runner> runners;
    private int finishedCount = 0;

    public Team() {
        teamName = "Team " + teamCount++;
    }

    public void prepare() {
        runners = new ArrayList<>(RUNNERS_PER_TEAM);
        for (int i = 0; i < RUNNERS_PER_TEAM; i++) {
            runners.add(new Runner(teamName, i + 1));
        }
        runners.get(0).start();
        for (int i = 1; i < runners.size(); i++) {
            runners.get(i).setPreviousRunner(runners.get(i - 1));
            runners.get(i).start();
        }
    }

    public void runnerFinished() {
        finishedCount++;
        if (finishedCount == RUNNERS_PER_TEAM) {
            Trophy.getInstance().acquire(this);
        }
    }

    public String getTeamName() {
        return teamName;
    }
}
