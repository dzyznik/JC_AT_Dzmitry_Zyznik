package main.java.project.runner;

import main.java.project.vessel.Bottle;
import main.java.project.stuff.SparklingWater;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        SparklingWater sprite = new SparklingWater("Green", "Yes", "Sweet", 5);
       Material_cl glass = new Glass(56, "Black", 1.2);
        List<Bottle> box = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Bottle bottle = new Bottle(1, 0.5, 100, glass, sprite);
            box.add(bottle);
        }
        Bottle bottle1 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle2 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle3 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle4 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle5 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle6 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle7 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle8 = new Bottle(1, 0.5, 100, glass, sprite);
//        Bottle bottle9 = new Bottle(1, 0.5, 100, glass, sprite);
//        Warehouse boxWithBottle = new Warehouse();
//        boxWithBottle.warehouseBottle("boxWithBottles", 9, bottle1, bottle2, bottle3, bottle4, bottle5, bottle6, bottle7, bottle8, bottle9);
        bottle1.getWater().warm(7);
        bottle1.open();






//        Material plastic = new Plastic(23, "Green", 2);
//        Cup cup1 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup2 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup3 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup4 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup5 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup6 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup7 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup8 = new Cup(0.3, 0.1, 20, plastic);
//        Cup cup9 = new Cup(0.3, 0.1, 20, plastic);
//
//        Warehouse boxWithCups = new Warehouse();
//        boxWithCups.warehouseCups("boxWithCups",24, cup1,cup2, cup3, cup4, cup5, cup6, cup7, cup8, cup9);

    }

}