package com.codegile.univ.paul.week1.day4.problems.generator;

import com.codegile.univ.paul.week1.day4.problems.entities.Car;
import com.codegile.univ.paul.week1.day4.problems.enums.CarBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.CarModel;
import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
    public List<Car> createCars(int count) {
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Car car = new Car();
            CarBrand brand = CarBrand.getRandom();
            car.setBrand(brand);
            List<CarModel> models = brand.getModels();
            car.setModel(models.get(RandomProvider.getNextInt(models.size())));
            carList.add(car);
        }
        return carList;
    }
}
