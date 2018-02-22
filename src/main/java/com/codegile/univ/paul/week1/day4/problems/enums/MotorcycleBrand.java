package com.codegile.univ.paul.week1.day4.problems.enums;

public enum MotorcycleBrand {
    SUZUKI("Suzuki"),
    YAMAHA("Yamaha"),
    FUFUKI("Fufuki");

    private final String text;

    MotorcycleBrand(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
