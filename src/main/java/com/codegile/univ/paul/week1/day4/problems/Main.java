package com.codegile.univ.paul.week1.day4.problems;

import com.codegile.univ.paul.week1.day4.problems.enums.CarBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.CarModel;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Driver> d = new ArrayList<Driver>();
        for (int i = 0; i < 10; i++) {
            Driver driver = new Driver();
            driver.name = "Driver" + (i + 1);
            driver.drivebleVehicles = new ArrayList<String>();
            Random random = new Random();
            if (random.nextBoolean() == true) {
                driver.drivebleVehicles.add("car");
            }
            if (random.nextBoolean() == true) {
                driver.drivebleVehicles.add("motorcycle");
            }
            if (random.nextBoolean() == true) {
                driver.drivebleVehicles.add("bus");
            }
            d.add(driver);
        }

        ArrayList<Car> c = new ArrayList<Car>();

        for (int i = 0; i < 5; i++) {
            Car car = new Car();

            car.setNumberOfWheels(4);
            ArrayList<CarBrand> carBrands = new ArrayList<>();
            carBrands.add(CarBrand.FORD);
            carBrands.add(CarBrand.MAZDA);
            carBrands.add(CarBrand.BMW);
            carBrands.add(CarBrand.AUDI);
            ArrayList<CarModel> carModels = new ArrayList<>();
            carModels.add(CarModel.MODEL1);
            carModels.add(CarModel.MODEL2);
            carModels.add(CarModel.MODEL3);
            carModels.add(CarModel.MODEL4);
            Random random = new Random();
            car.setCarBrand(carBrands.get(random.nextInt(4)));
            car.setCarModel(carModels.get(random.nextInt(4)));
            c.add(car);
        }

        ArrayList<Motorcycle> m = new ArrayList<Motorcycle>();

        for (int i = 0; i < 5; i++) {
            Motorcycle motorcycle = new Motorcycle();

            motorcycle.setNumberOfWheels(2);
            ArrayList<String> string = new ArrayList<String>();
            string.add("Suzuki");
            string.add("Yamaha");
            string.add("Fufuki");
            ArrayList<String> string2 = new ArrayList<String>();
            string2.add("100");
            string2.add("101");
            string2.add("200");
            string2.add("300");
            Random random = new Random();
            motorcycle.setBrand(string.get(random.nextInt(3)));
            motorcycle.setModel(string2.get(random.nextInt(4)));
            motorcycle.setCilinderCapactiy(random.nextInt(2001) + 500);
            m.add(motorcycle);
        }

        ArrayList<Bus> b = new ArrayList<Bus>();

        for (int i = 0; i < 5; i++) {
            Bus bus = new Bus();

            bus.setNumberOfWheels(8);
            ArrayList<String> strings = new ArrayList<String>();
            strings.add("Mercedes");
            strings.add("Volkswagen");
            ArrayList<String> strings1 = new ArrayList<String>();
            strings1.add("C100");
            strings1.add("D200");
            Random random = new Random();
            bus.setBrand(strings.get(random.nextInt(2)));
            bus.setModel(strings1.get(random.nextInt(2)));
            bus.setNumOfSeats(random.nextInt(21) + 20);
            b.add(bus);
        }

        for (int i = 0; i < d.size(); i++) {
            Random random = new Random();
            int j = random.nextInt(c.size() + b.size() + m.size());
            if (j >= c.size()) {
                if (j >= c.size() + m.size()) {
                    d.get(i).drive(b.get(j - c.size() - m.size()));
                } else {
                    d.get(i).drive(m.get(j - c.size()));
                }
            } else {
                d.get(i).drive(c.get(j));
            }
        }
    }
}
