package main.java.project.runner;

import main.java.project.boxing.Bottle;
import main.java.project.boxing.Cup;
import main.java.project.material.Glass;
import main.java.project.material.Material;
import main.java.project.material.Plastic;
import main.java.project.warehouse.Warehouse;
import main.java.project.water.SparklingWater;
import main.java.project.water.Water;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Material glass = new Glass(56, "Black", 1.2);
        Bottle bottle1 = new Bottle(1, 0.5, 100, glass);
        bottle1.water("Red", "No", "Sweet", 5);
        Warehouse boxWithBottle = new Warehouse();
        boxWithBottle.warehouseBottle("boxWithBottles", 9, bottle1);
//        bottle1.open();

        Material plastic = new Plastic(23, "Green", 2);
        Cup cup1 = new Cup(0.3, 0.1, 20, plastic);
        Warehouse boxWithCups = new Warehouse();
        boxWithCups.warehouseCups("boxWithCups",24, cup1);

    }

}