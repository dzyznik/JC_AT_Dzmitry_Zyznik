package main.java.project.warehouse;


import main.java.project.boxing.*;
import main.java.project.material.Material;

import java.io.IOException;

public class Warehouse {
    String boxName;

    public void warehouseBottle (String boxName,int count, Bottle bottle) throws IOException {
        this.boxName = boxName;
        VesselBox <Bottle> boxWithBottles = new VesselBox<>(count);
        for (int i = 0; i < boxWithBottles.length(); i++) {
            boxWithBottles.add(bottle);
        }
        System.out.println("Box with " + boxWithBottles.length() + " bottles created");
        Stocktaking stocktaking = new Stocktaking(boxWithBottles, boxName);
    }

    public void warehouseCups (String boxName,int count, Cup cup) throws IOException {
        this.boxName = boxName;
        VesselBox <Cup> boxWithCups = new VesselBox<>(count);
        for (int i = 0; i < boxWithCups.length(); i++) {
            boxWithCups.add(cup);
        }
        System.out.println("Box with " + boxWithCups.length() + " cups created");
        Stocktaking stocktaking = new Stocktaking(boxWithCups, boxName);
    }


        }




