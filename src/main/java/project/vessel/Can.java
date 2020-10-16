package main.java.project.vessel;

import main.java.project.stuff.Transformable;

public class Can extends Vessel implements Containable {
    public Can(double volume, double diameter, int weight, Material_cl materialCl) {
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(materialCl);
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
