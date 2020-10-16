package main.java.project.vessel;

import java.io.Serializable;

public abstract class Vessel implements Serializable {
    private double volume;
    private double diameter;
    private int weight;
    private Material_cl materialCl;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material_cl getMaterial() {
        return materialCl;
    }

    public void setMaterial(Material_cl materialCl) {
        this.materialCl = materialCl;
    }
}
