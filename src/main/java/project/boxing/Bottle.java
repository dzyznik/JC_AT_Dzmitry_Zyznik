package main.java.project.boxing;

import main.java.project.interfaces.Containable;
import main.java.project.interfaces.Transformable;
import main.java.project.structure.Bubble;
import main.java.project.material.Material;
import main.java.project.water.SparklingWater;
import main.java.project.water.Water;

import java.io.Serializable;

public class Bottle extends Vessel implements Containable, Serializable {


    private double volume;
    private SparklingWater water;



    public double getVolume() {
        return volume;
    }

    public Bottle(double volume, double diameter, int weight, Material material, SparklingWater water) {
        this.volume = volume;
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
        Bubble[] b = new Bubble[(int) (this.volume * 10000)];
        water.pump(b);
        System.out.println("New bottle is created");
        this.water = water;
        setWater(water);
        water.checkIsOpened();
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        water.setOpened(true);
        System.out.println("Bottle is opened");
    }

    @Override
    public void close() {

    }

    public void closed() {
        water.setOpened(false);
        System.out.println("Bottle is closed");
    }


    public void warm(int temperature) throws InterruptedException {
        water.setTemperature(temperature);
        while (water.getTemperature() < 42) {
            if (water.getTemperature() < 41) {
                temperature = water.getTemperature();
                temperature++;
                water.setTemperature(temperature);
                System.out.println("Temperature is set to: " + temperature);
            }
            Thread.sleep(10000);
        }
    }


    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}