package main.java.project.material;

//- abstract class Material (extending classes Glass, Plastic, Metal)
// -- private double thermalConductivity;
// -- private String color;
// -- private double density;
// -- all field are set in costructor
public abstract class Material {
    private double thermalConductivity;
    private String color;
    private double density;

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
