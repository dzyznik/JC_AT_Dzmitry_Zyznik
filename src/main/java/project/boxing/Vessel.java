package main.java.project.boxing;

//- each Vessel has:
//        -- private double volume;
//        -- private double diameter;
//        -- private int weight;
//        -- private Material material;
//        -- all field are set in costructor
public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;

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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
