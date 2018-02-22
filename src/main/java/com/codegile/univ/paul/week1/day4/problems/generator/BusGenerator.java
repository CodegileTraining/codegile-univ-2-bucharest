package com.codegile.univ.paul.week1.day4.problems.generator;

import com.codegile.univ.paul.week1.day4.problems.entities.Bus;
import com.codegile.univ.paul.week1.day4.problems.enums.BusBrand;
import com.codegile.univ.paul.week1.day4.problems.enums.BusModel;
import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.ArrayList;
import java.util.List;

public class BusGenerator {
    public ArrayList <Bus> createBus(int count){
       ArrayList <Bus> busList = new ArrayList<>();

        for (int i = 0; i < count; i++)
        {
            Bus bus = new Bus(8);
            BusBrand brand=BusBrand.getRandom();
            bus.setBrand(brand);
            List<BusModel> model= brand.getModel();
            bus.setModel(model.get(RandomProvider.getNextInt(model.size())));
            busList.add(bus);
        }
        return busList;
    }
}
