package com.codegile.univ.paul.week1.day4.problems.enums;

public enum BusModel {
    C100("C100"),
    D200("D200");

    private final String text;

    BusModel(final String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
