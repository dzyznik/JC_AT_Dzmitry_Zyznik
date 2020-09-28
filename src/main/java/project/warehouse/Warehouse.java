package main.java.project.warehouse;


import main.java.project.boxing.*;
import main.java.project.material.Material;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Warehouse {
    String boxName;

    public void warehouseBottle(String boxName, int count, Bottle bottle1, Bottle bottle2, Bottle bottle3, Bottle bottle4, Bottle bottle5, Bottle bottle6, Bottle bottle7, Bottle bottle8, Bottle bottle9) throws IOException, ClassNotFoundException {
        this.boxName = boxName;
        VesselBox<Bottle> boxWithBottles = new VesselBox<>(count);
        boxWithBottles.add(bottle1);
        boxWithBottles.add(bottle2);
        boxWithBottles.add(bottle3);
        boxWithBottles.add(bottle4);
        boxWithBottles.add(bottle5);
        boxWithBottles.add(bottle6);
        boxWithBottles.add(bottle7);
        boxWithBottles.add(bottle8);
        boxWithBottles.add(bottle9);
        System.out.println("Box with " + boxWithBottles.length() + " bottles created");
        Stocktaking stocktaking = new Stocktaking(boxWithBottles, boxName);
    }

    public void warehouseCups(String boxName, int count, Cup cup) throws IOException, ClassNotFoundException {
        this.boxName = boxName;
        VesselBox<Cup> boxWithCups = new VesselBox<>(count);
        for (int i = 0; i < boxWithCups.length(); i++) {
            boxWithCups.add(cup);
        }
        System.out.println("Box with " + boxWithCups.length() + " cups created");
        Stocktaking stocktaking = new Stocktaking(boxWithCups, boxName);
    }


}




