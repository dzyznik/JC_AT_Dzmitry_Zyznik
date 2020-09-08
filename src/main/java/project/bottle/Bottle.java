package main.java.project.bottle;

import main.java.project.bubbles.Bubble;
import main.java.project.water.SparklingWater;

public class Bottle {
    public double volume;
    String water;
    int t;
    boolean warmWater = false;

    public Bottle(double volume, String water, int t, boolean warmWater){
        this.volume = volume;
        this.water = water;
        this.t = t;
        this.warmWater = warmWater;
    }


    public Bottle(double volume, String water, int t){
        this.volume = volume;
        this.water = water;
        this.t = t;

    }

    public void open() throws InterruptedException {
        SparklingWater open = new SparklingWater(true, this.volume, this.t, this.warmWater);
        System.out.println("Bottle is opened");
        Bubble[] b = new Bubble[(int) (this.volume * 10000)];
        open.pump(b);
    }


}
