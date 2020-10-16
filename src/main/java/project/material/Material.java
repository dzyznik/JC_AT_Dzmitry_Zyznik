package main.java.project.material;

public enum Material {
    METAL(58.0, "silver", 7800),
    PLASTIC(0.2, "white", 1800),
    GLASS(0.017, "green", 2200);

    private double thermalConductivity;
    private String color;
    private double density;

    private Material(double thermalConductivity, String color, double density) {
        thermalConductivity = this.thermalConductivity;
        color = this.color;
        density = this.density;
    }
}
