package main.java.project.stuff;

public abstract class Sand implements Transformable {
    private String color = "brown";
    private String transparency = "not transparent";
    private String smell = "no";
    private int temperature = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Sand() {

    }

    public Sand(String color, String transparency, String smell, int temperature) {
        this.color = color;
        this.transparency = transparency;
        this.smell = smell;
        this.temperature = temperature;
    }

    @Override
    public void mix() {

    }
}
