package com.codegile.univ.paul.week6.day1.problems.crud;

/**
 * Exception thrown when a requested entity is not found in the DB.
 */
public class NotFoundException extends Exception {

    public NotFoundException() {
        super("Not found");
    }
}
