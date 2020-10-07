package main.java.project.vessel;

import main.java.project.stuff.Transformable;
import main.java.project.stuff.Bubble;
import main.java.project.material.Material;
import main.java.project.stuff.SparklingWater;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable, Serializable {


    private double volume;
    private SparklingWater water;



    public double getVolume() {
        return volume;
    }

    public Bottle(double volume, double diameter, int weight, Material material,SparklingWater water) {
        this.volume = volume;
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
        List <Bubble> bubbles = new ArrayList();
        water.pump(bubbles, (int) (volume * 10000));
        System.out.println("New bottle is created");
        addStuff(water);
        water.checkIsOpened();
    }



    @Override
    public void addStuff(Transformable stuff) {
        this.water = (SparklingWater) stuff;
        setWater(water);
    }

    @Override
    public Transformable removeStuff() {
        setWater(null);
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (this.water != null){
            return true;
        }
        else
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {
        water.setOpened(true);
        System.out.println("Bottle is opened");
    }

    @Override
    public void close() {
        water.setOpened(false);
        System.out.println("Bottle is closed");

    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}