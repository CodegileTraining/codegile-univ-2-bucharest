package com.codegile.univ.paul.week1.day4.problems.enums;

public enum MotorcycleModel {
    CMC100(100),
    CMC101(101),
    CMC200(200),
    CMC300(300);

    private final int value;

    MotorcycleModel(final int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
