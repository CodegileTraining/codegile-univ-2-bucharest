package com.codegile.univ.paul.week1.day4.problems.enums;

public enum CarModel {
    MODEL1("Model 1"),
    MODEL2("Model 2"),
    MODEL3("Model 3"),
    MODEL4("Model 4");

    private final String text;

    CarModel(final String text) {
     this.text = text;
    }

    public String getText() {
        return text;
    }
}
