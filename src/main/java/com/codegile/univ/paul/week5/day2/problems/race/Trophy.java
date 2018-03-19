package com.codegile.univ.paul.week5.day2.problems.race;

public class Trophy {

    private static final Trophy INSTANCE = new Trophy();
    private boolean isAcquired = false;

    private Trophy() {
    }

    public static Trophy getInstance() {
        return INSTANCE;
    }

    public void acquire(Team team) {
        if (!isAcquired) {
            isAcquired = true;
            System.out.println(team.getTeamName() + " is the WINNER!!!!!");
        }
    }
}
