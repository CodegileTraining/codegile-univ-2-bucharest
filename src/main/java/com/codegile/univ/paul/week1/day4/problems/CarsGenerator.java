package com.codegile.univ.paul.week1.day4.problems;

import java.util.ArrayList;
import java.util.List;

public class CarsGenerator {
    public static List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Car car = new Car();
            car.setNumberOfWheels(4);
            CarMake carMake = CarMake.getRandom();
            CarModel carModel = CarModel.getRandom();
            car.setCarMake(carMake);
            cars.add(car);
        }
        return cars;
    }
}
