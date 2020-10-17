package main.java.project.vessel;

import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.SparklingWater;

import java.io.Serializable;

public class Bottle extends Vessel implements Containable, Serializable {
    private Transformable stuff;

//    public Transformable getStuff() {
//        return stuff;
//    }
//
//    public void setStuff(Transformable stuff) {
//        this.stuff = stuff;
//    }


    public Bottle(double volume, Material material) {
        setVolume(volume);
        double diameter = 2.0;
        setDiameter(diameter);
        setMaterial(material);
        setWeight((int) (material.getDensity() * volume / 4));
        System.out.println("New bottle is created");
    }

    @Override
    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
        System.out.println("Stuff was added to can");
    }

    @Override
    public Transformable removeStuff() {
        this.stuff = null;
        System.out.println("Stuff was removed from bottle");
        return null;
    }

    @Override
    public boolean isEmpty() {
       if (this.stuff == null){
           System.out.println("Bottle is empty");
           return true;
       }
       else {
           System.out.println("Bottle isn't empty");
           return false;
       }
    }

    @Override
    public void open() {
        this.stuff.setOpened();
        System.out.println("Bottle is opened");
    }

    @Override
    public void warm(int temperature) {
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(60000);
                while (this.stuff.getTemperature() <= 40) {
                    int temperatureNew = this.stuff.getTemperature() + 1;
                    this.stuff.setTemperature(temperatureNew);
                    System.out.println("Temperature is set to: " + this.stuff.getTemperature());
                    Thread.sleep(60000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread2.start();

    }
}