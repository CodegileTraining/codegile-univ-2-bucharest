package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Driver> drivers = new ArrayList<>();
        drivers = DriversGenerator.getDrivers(10);
        List<Car> cars = new ArrayList<>();
        cars = CarsGenerator.getCars(5);
        for(int i=0; i<5; i++){
            System.out.println();
        }
        List<Bus> busses = new ArrayList<>();
        busses = BussesGenerator.getBusses(5);
        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles = MotorcyclesGenerator.getMotorcycles(5);
        List<Automobile> vehicles = new ArrayList<>();
        vehicles.addAll(cars);
        vehicles.addAll(busses);
        vehicles.addAll(motorcycles);
        for (Driver driver : drivers){

        }
    }
}
