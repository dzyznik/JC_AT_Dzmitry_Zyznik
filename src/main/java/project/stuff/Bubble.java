package main.java.project.stuff;

import java.io.Serializable;

public class Bubble implements Serializable {
    private static final double VOLUME = 0.3;
    private String gas;

    public Bubble(String gas) {
         this.gas = gas;
    }

    public void cramp() {

        System.out.println("Cramp!");
    }

    public double getVolume() {

        return VOLUME;
    }
}