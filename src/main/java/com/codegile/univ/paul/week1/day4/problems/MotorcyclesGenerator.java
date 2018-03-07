package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;

public class MotorcyclesGenerator {
    public static List<Motorcycle> getMotorcycles(int count) {
        List<Motorcycle> motorcycles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.setNumberOfWheels(2);
            MotorcycleMake motorcycleMake = MotorcycleMake.getRandom();
            MotorcycleModel motorcycleModel = MotorcycleModel.getRandom();
            motorcycles.add(motorcycle);
        }
        return motorcycles;
    }
}
