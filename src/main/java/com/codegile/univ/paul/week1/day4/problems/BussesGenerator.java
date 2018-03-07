package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;

public class BussesGenerator {
    public static List<Bus> getBusses(int count) {
        List<Bus> busses = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Bus bus = new Bus();
            bus.setNumberOfWheels(8);
            BusMake busMake = BusMake.getRandom();
            BusModel busModel = BusModel.getRandom();
            busses.add(bus);
        }
        return busses;
    }
}
