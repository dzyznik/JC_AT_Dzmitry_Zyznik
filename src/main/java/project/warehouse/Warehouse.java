package main.java.project.warehouse;

import main.java.project.boxing.Bottle;
import main.java.project.boxing.Cup;
import main.java.project.boxing.VesselBox;
import main.java.project.material.Glass;
import main.java.project.material.Plastic;


public class Warehouse {
    public static void main(String[] args) {
        VesselBox<Cup> boxWithCup = new VesselBox<>(9);
        Glass glass = new Glass(56, "Black", 1.2);
        Cup cup = new Cup(0.2, 5, 150, glass);
        System.out.println(boxWithCup.length());
        for (int i = 0; i < boxWithCup.length(); i++) {
            boxWithCup.add(cup);
        }

        VesselBox<Bottle> boxWithBottles = new VesselBox<>(24);
        Plastic plastic = new Plastic(40, "Green", 0.5);
        Bottle bottle = new Bottle(0.5, 2, 150, plastic);
        System.out.println(boxWithBottles.length());
        for (int i = 0; i < boxWithBottles.length(); i++) {
            boxWithBottles.add(bottle);
        }

        }
    }



