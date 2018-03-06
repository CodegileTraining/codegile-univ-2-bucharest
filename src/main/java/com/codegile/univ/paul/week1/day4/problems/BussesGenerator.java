package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;

public class BussesGenerator {
    public static List<Bus> getBusses() {
        List<Bus> busses = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Bus bus = new Bus();
            bus.setNumberOfWheels(8);
            BusMake busMake = BusMake.getRandom();
            CarModel carModel = CarModel.getRandom();
            busses.add(bus);
        }
        return busses;
    }
}
