package main.java.project.boxing;

import main.java.project.interfaces.Containable;
import main.java.project.interfaces.Transformable;
import main.java.project.material.Material;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, double diameter, int weight, Material material) {
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
        System.out.println("New cup is created");
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

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
