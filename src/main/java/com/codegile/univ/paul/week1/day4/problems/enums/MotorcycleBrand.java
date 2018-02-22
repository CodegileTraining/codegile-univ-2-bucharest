package com.codegile.univ.paul.week1.day4.problems.enums;

import com.codegile.univ.paul.week1.day4.problems.utils.RandomProvider;

import java.util.Arrays;
import java.util.List;

public enum MotorcycleBrand {
    SUZUKI("Suzuki", Arrays.asList(MotorcycleModel.M100, MotorcycleModel.M101)),
    YAMAHA("Yamaha", Arrays.asList(MotorcycleModel.M200,MotorcycleModel.M201)),
    FUFUKI("Fufuki",Arrays.asList(MotorcycleModel.M300,MotorcycleModel.M301));

    private String readable;
    private List<MotorcycleModel> model;
    public List<MotorcycleModel> getModel(){ return model; }
    MotorcycleBrand(String readable,List<MotorcycleModel> model){
        this.readable = readable;
        this.model=model;
    }

    public String getReadable() {
        return readable;
    }

    public static MotorcycleBrand getRandom() {
        MotorcycleBrand[] brands = MotorcycleBrand.values();
        int number = brands.length;
        int selected = RandomProvider.getNextInt(number);
        return brands[selected];
    }
}
