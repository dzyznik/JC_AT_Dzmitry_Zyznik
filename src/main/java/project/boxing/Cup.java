package main.java.project.boxing;

import main.java.project.material.Material;

public class Cup extends Vessel {
    public Cup(double volume, double diameter, int weight, Material material){
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
    }
}
