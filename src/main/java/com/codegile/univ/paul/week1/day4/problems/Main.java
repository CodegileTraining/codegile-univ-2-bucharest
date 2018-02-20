package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Driver> driverList=new Driver().createDrivers(10,random);
        ArrayList<Car> carList = new ArrayList<Car>();

        for (int i = 0; i < 5; i++) {
            Car car = new Car();

            car.setNumberOfWheels(4);
            ArrayList<String> carBrands = new ArrayList<>();
            carBrands.add("Ford");
            carBrands.add("Mazda");
            carBrands.add("BMW");
            carBrands.add("Audi");
            ArrayList<String> carModels = new ArrayList<>();
            carModels.add("Model 1");
            carModels.add("Model 2");
            carModels.add("Moddel 3");
            carModels.add("Model 4");
            car.setBrand(carBrands.get(random.nextInt(4)));
            car.setModel(carModels.get(random.nextInt(4)));
            carList.add(car);
        }

        ArrayList<Motorcycle> motorcycleList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Motorcycle motorcycle = new Motorcycle();

            motorcycle.setNumberOfWheels(2);
            ArrayList<String> motorcycleBrands = new ArrayList<>();
            motorcycleBrands.add("Suzuki");
            motorcycleBrands.add("Yamaha");
            motorcycleBrands.add("Fufuki");
            ArrayList<String> motorcycleModels = new ArrayList<>();
            motorcycleModels.add("100");
            motorcycleModels.add("101");
            motorcycleModels.add("200");
            motorcycleModels.add("300");
            motorcycle.setBrand(motorcycleBrands.get(random.nextInt(3)));
            motorcycle.setModel(motorcycleModels.get(random.nextInt(4)));
            motorcycle.setCilinderCpactiy(random.nextInt(2001) + 500);
            motorcycleList.add(motorcycle);
        }

        ArrayList<Bus> busList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Bus bus = new Bus();

            bus.setNumberOfWheels(8);
            ArrayList<String> busBrands = new ArrayList<>();
            busBrands.add("Mercedes");
            busBrands.add("Volkswagen");
            ArrayList<String> busModels = new ArrayList<>();
            busModels.add("C100");
            busModels.add("D200");
            bus.setBrand(busBrands.get(random.nextInt(2)));
            bus.setModel(busModels.get(random.nextInt(1)));
            bus.setNumOfSeats(random.nextInt(21) + 20);
            busList.add(bus);
        }

        for (int i = 0; i < driverList.size(); i++) {

            int j = random.nextInt(carList.size() + busList.size() + motorcycleList.size());
            if (j >= carList.size()) {
                if (j >= carList.size() + motorcycleList.size()) {
                   driverList.get(i).drive(busList.get(j - carList.size() - motorcycleList.size()));
                } else {
                    driverList.get(i).drive(motorcycleList.get(j - carList.size()));
                }
            } else {
                driverList.get(i).drive(carList.get(j));
            }
        }
    }

    //To do
//    public static ArrayList<Vehicle> createVehicles(int numberOfWheels,ArrayList<String> brands, ArrayList<String> models ){
//
//    }
}
