package main.java.project.runner;

import main.java.project.bottle.Bottle;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        //⁃ в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
        //- открыть поочередно все бутылки и выпустить из них газ
        Bottle bottle1 = new Bottle(1.5, "Sparkling", 5, true);
        Bottle bottle2 = new Bottle(1.5, "Sparkling", 22);

        bottle1.open();
        bottle2.open();




    }
}
