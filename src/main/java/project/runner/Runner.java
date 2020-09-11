package main.java.project.runner;

import main.java.project.bottle.Bottle;

public class Runner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(1.0);
        bottle1.water("Red", "No", "Sweet", 5);
        bottle1.warmWater(true);
        bottle1.open();

        Bottle bottle2 = new Bottle(1.0);
        bottle2.water("Black", "Yes", "Sour", 10);
        bottle2.warmWater(false);
        bottle2.open();

    }

}