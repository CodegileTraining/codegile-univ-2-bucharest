package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.Arrays;
import java.util.List;

public enum BusBrand {
    MERCEDES("Mercedes", Arrays.asList(BusModel.C100)),
    VOLKSWAGEN("Volkswagen",Arrays.asList(BusModel.D200));

    private String brand;
    private List<BusModel> model;



    BusBrand(String brand, List<BusModel> model) {
        this.brand = brand;
        this.model=model;
    }

    public List<BusModel> getModel(){
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public static BusBrand getRandom() {
        BusBrand[] brands = BusBrand.values();
        int number = brands.length;
        int selected = RandomProvider.getNextInt(number);
        return brands[selected];
    }
}
