package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.SparklingWater;

import java.io.Serializable;

public class Bottle extends Vessel implements Containable, Serializable {
    private Transformable stuff;
    public Bottle(double volume, Material material) {
        setVolume(volume);
        double diameter = 2.0;
        setDiameter(diameter);
        setMaterial(material);
        setWeight((int) (material.getDensity() * volume / 4));
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
    public void open() {

    }

    @Override
    public void warm(int temperature) {

    }
}