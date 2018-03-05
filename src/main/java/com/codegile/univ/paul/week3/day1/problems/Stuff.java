package com.codegile.univ.paul.week3.day1.problems;

import java.util.Objects;

public class Stuff {

    private static int count = 1;
    private int myCount;
    private String myString;

    public Stuff() {
        myCount = count++;
    }

    @Override
    public String toString() {
        return "some stuff " + myCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stuff stuff = (Stuff) o;
        return myCount == stuff.myCount &&
                Objects.equals(myString, stuff.myString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myCount, myString);
    }

    // if two objects are equal, hashCode must return the same value
    // two objects with the same hashCode ARE NOT equal (necessarily)
}
