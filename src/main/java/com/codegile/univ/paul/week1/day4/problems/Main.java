package com.codegile.univ.paul.week1.day4.problems;

import com.codegile.univ.paul.week1.day4.problems.entities.*;
import com.codegile.univ.paul.week1.day4.problems.enums.*;
import com.codegile.univ.paul.week1.day4.problems.generator.BusGenerator;
import com.codegile.univ.paul.week1.day4.problems.generator.CarGenerator;
import com.codegile.univ.paul.week1.day4.problems.generator.DriversGenerator;
import com.codegile.univ.paul.week1.day4.problems.generator.MotorcycleGenerator;
import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Driver> driverList = new DriversGenerator().createDrivers(10);
        List<Car> carList = new CarGenerator().createCars(5);
        List<Motorcycle> motorcycleList = new MotorcycleGenerator().createMotorcycle(5);
        List<Bus> busList = new BusGenerator().createBus(5);


        List<Automobile> autoList = new ArrayList<>();
        autoList.addAll(carList);
        autoList.addAll(busList);
        autoList.addAll(motorcycleList);

        for (Driver driver : driverList)
        {
            driver.drive(autoList.get(RandomProvider.getNextInt(autoList.size())));
        }


    }
}
