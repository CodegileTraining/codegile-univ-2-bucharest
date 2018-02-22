package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.Bus;

public enum BusBrand {
    MERCEDES("Mercedes"),
    VOLKSVAGEN("Volkswagen");

    private final String text;

    BusBrand(final String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
