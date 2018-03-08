package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Driver> drivers = DriversGenerator.getDrivers(10);
        List<Car> cars = CarsGenerator.getCars(5);
        List<Bus> busses = BussesGenerator.getBusses(5);
        List<Motorcycle> motorcycles = MotorcyclesGenerator.getMotorcycles(5);
        List<Automobile> vehicles = new ArrayList<>();
        vehicles.addAll(cars);
        vehicles.addAll(busses);
        vehicles.addAll(motorcycles);
        for (Driver driver : drivers){
            int position = RandomGenerator.getInt(vehicles.size());
            Automobile automobile = vehicles.get(position);
            driver.drive(automobile);
        }

        Map<Motorcycle, Driver> map = new CustomMap<>();

        map.get(1);

        for (Map.Entry<Motorcycle, Driver> entry : map.entrySet()) {
            Motorcycle key = entry.getKey();
            Driver value = entry.getValue();


        }
    }
}
