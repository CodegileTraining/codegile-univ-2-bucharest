package com.codegile.univ.paul.week5.day2.problems.race;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Vlad: 2
     * Raluca: 0
     * Dragos: -2
     * Andrei: 0
     */

    private static final int TEAM_COUNT = 3;

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>(TEAM_COUNT);
        for (int i = 0; i < TEAM_COUNT; i++) {
            Team team = new Team();
            team.prepare();
            teams.add(team);
        }

        Gate.getInstance().countDown();
    }
}
