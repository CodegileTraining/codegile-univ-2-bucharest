package com.codegile.univ.paul.week1.day4.problems.enums;

public enum CarBrand {
    FORD("Ford"),
    MAZDA("Mazda"),
    BMW("BMW"),
    AUDI("Audi");

    private final String text;

    CarBrand(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
