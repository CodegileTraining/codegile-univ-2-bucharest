package com.codegile.univ.paul.week1.day4.problems.generator;

import com.codegile.univ.paul.week1.day4.problems.entities.Motorcycle;
import com.codegile.univ.paul.week1.day4.problems.enums.CarBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.CarModel;
import com.codegile.univ.paul.week1.day4.problems.enums.MotorcycleBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.MotorcycleModel;
import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleGenerator {
    public List<Motorcycle> createMotorcycle(int count) {
        List<Motorcycle> motorcycleList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            Motorcycle motorcycle = new Motorcycle();
            MotorcycleBrand brand= MotorcycleBrand.getRandom();
            motorcycle.setBrand(brand);
            List<MotorcycleModel> model=brand.getModel();
            motorcycle.setModel(model.get(RandomProvider.getNextInt(model.size())));
            motorcycleList.add(motorcycle);
        }
        return motorcycleList;
    }
}
