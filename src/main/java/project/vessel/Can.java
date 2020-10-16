package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;

public class Can extends Vessel implements Containable {
    private Transformable stuff;
    public Can(double volume, Material material) {
        setVolume(volume);
        double diameter = 10.0;
        setDiameter(diameter);
        setMaterial(material);
        setWeight((int) (material.getDensity() * volume / 4));
        System.out.println("New can is created");
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
