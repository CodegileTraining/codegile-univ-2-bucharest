package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Driver> d = new ArrayList<Driver>();
        for (int i = 0; i < 10; i++) {
            Driver driver = new Driver();
            driver.name = "Drvier" + (i + 1);
            driver.drivble_vehicles = new ArrayList<String>();
            Random random = new Random();
            if (random.nextBoolean() == true) {
                driver.drivble_vehicles.add("car");
            }
            if (random.nextBoolean() == true) {
                driver.drivble_vehicles.add("motorcycle");
            }
            if (random.nextBoolean() == true) {
                driver.drivble_vehicles.add("bus");
            }
            d.add(driver);
        }

        ArrayList<Car> c = new ArrayList<Car>();

        for (int i = 0; i < 5; i++) {
            Car car = new Car();

            car.number_of_wheels = 4;
            ArrayList<String> string = new ArrayList<String>();
            string.add("Ford");
            string.add("Mazda");
            string.add("BMW");
            string.add("Audi");
            ArrayList<String> string2 = new ArrayList<String>();
            string2.add("Model 1");
            string2.add("Model 2");
            string2.add("Moddel 3");
            string2.add("Model 4");
            Random random = new Random();
            car.make = string.get(random.nextInt(4));
            car.model = string.get(random.nextInt(4));
            c.add(car);
        }

        ArrayList<Motorcycle> m = new ArrayList<Motorcycle>();

        for (int i = 0; i < 5; i++) {
            Motorcycle motorcycle = new Motorcycle();

            motorcycle.num_of_wheels = 2;
            ArrayList<String> string = new ArrayList<String>();
            string.add("Suzuki");
            string.add("Yamaha");
            string.add("Fufuki");
            ArrayList<String> strin2 = new ArrayList<String>();
            strin2.add("100");
            strin2.add("101");
            strin2.add("200");
            strin2.add("300");
            Random random = new Random();
            motorcycle.make = string.get(random.nextInt(4));
            motorcycle.model = strin2.get(random.nextInt(4));
            motorcycle.cilinder_cpactiy = random.nextInt(2001) + 500;
        }

        ArrayList<Bus> b = new ArrayList<Bus>();

        for (int i = 0; i < 5; i++) {
            Bus bus = new Bus();

            bus.num_of_wheels = 8;
            ArrayList<String> strings = new ArrayList<String>();
            strings.add("Mercedes");
            strings.add("Volkswagen");
            ArrayList<String> strings1 = new ArrayList<String>();
            strings1.add("C100");
            strings.add("D200");
            Random random = new Random();
            bus.make = strings.get(random.nextInt(2));
            bus.mode = strings1.get(random.nextInt(2));
            bus.num_of_seats = random.nextInt(21) + 20;
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
