package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Driver> drivers = new ArrayList<>();
        drivers = DriversGenerator.getDrivers();
        List<Car> cars = new ArrayList<>();
        cars = CarsGenerator.getCars();
        List<Bus> busses = new ArrayList<>();
        busses = BussesGenerator.getBusses();
        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles = MotorcyclesGenerator.getMotorcycles();
        List<Automobile> vehicles = new ArrayList<>();
        vehicles.addAll(cars);
        vehicles.addAll(busses);
        vehicles.addAll(motorcycles);
        for (int i = 0; i < drivers.size(); i++) {
            int j = RandomGenerator.getInt();
            drivers.get(i);

        }
        System.out.println(drivers);

    }
}
