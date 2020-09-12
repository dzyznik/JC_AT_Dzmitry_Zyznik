package main.java.project.boxing;

import main.java.project.material.Material;

public class Can extends Vessel {
    public Can(double volume, double diameter, int weight, Material material){
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
    }
}
