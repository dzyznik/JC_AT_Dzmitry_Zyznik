package main.java.project.warehouse;

import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;
import main.java.project.stuff.Transformable;
import main.java.project.vessel.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Factory {
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void createVesselBox(String boxName, int capacity, double volume, Material material, Transformable stuff, Class<?> clazz){
        List <Containable> boxContent = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            boxContent.add(createVessel(volume,material,stuff,clazz));
        }
        VesselBox box = new VesselBox(boxName, boxContent);
    }

    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz){
        if (clazz.getClass().getSimpleName().equals("Bottle")) {
            Bottle bottle = new Bottle(volume, material);
            bottle.addStuff(stuff);
            return bottle;
        }
        if (clazz.getClass().getSimpleName().equals("Can")) {
            Can can = new Can(volume, material);
            can.addStuff(stuff);
            return can;
        }
        if (clazz.getClass().getSimpleName().equals("Cup")) {
            Cup cup = new Cup(volume, material);
            cup.addStuff(stuff);
            return cup;
        }
        else return null;
    }
    }


