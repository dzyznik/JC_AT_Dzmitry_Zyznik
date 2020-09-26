package main.java.project.boxing;

import main.java.project.interfaces.Containable;
import main.java.project.interfaces.Transformable;
import main.java.project.structure.Bubble;
import main.java.project.material.Material;
import main.java.project.water.SparklingWater;
import main.java.project.water.Water;

public class Bottle extends Vessel implements Containable {


    private double volume;
    private SparklingWater water;



    public double getVolume() {
        return volume;
    }

    public Bottle(double volume, double diameter, int weight, Material material) {
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
        Bubble[] b = new Bubble[(int) (this.volume * 10000)];
        water = new SparklingWater();
        water.pump(b);
        System.out.println("New bottle is created");

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
    }

    @Override
    public void close() {

    }

    public void closed() {
        water.setOpened(false);
        System.out.println("Bottle is closed");
    }


//    public void warm(int temperature) {
//        int time = 0;
//        while (warm) {
//            if (water.getTemperature() < 41) {
//                time++;
//                if (time > 2) {
//                    temperature = water.getTemperature();
//                    temperature++;
//                    water.setTemperature(temperature);
//                    System.out.println("Temperature is set to: " + temperature);
//                    time = 0;
//                }
//            }
//        }
//    }

    public void water(String color, String transparency, String smell, int temperature) {
        water.setColor(color);
        water.setTransparency(transparency);
        water.setSmell(smell);
        water.setTemperature(temperature);
        System.out.println("Color is set to " + color);
        System.out.println("Transparency is set to " + transparency);
        System.out.println("Smell is set to " + smell);
        System.out.println("Temperature is set to " + temperature);
    }


    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}