package main.java.project.water;

import main.java.project.boxing.Bottle;
import main.java.project.structure.Bubble;

import java.io.Serializable;

public class SparklingWater extends Water implements Serializable {
    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() {
        isOpened();
    }

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        setColor(color);
        setTransparency(transparency);
        setSmell(smell);
        setTemperature(temperature);
        System.out.println("Color is set to " + color);
        System.out.println("Transparency is set to " + transparency);
        System.out.println("Smell is set to " + smell);
        System.out.println("Temperature is set to " + temperature);
    }

    private void isOpened() {
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            this.bubbles[i] = new Bubble("CO2");
        }
        System.out.println("Bubbles are pumped in water");

    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }


    public void checkIsOpened() {
        Thread thread = new Thread() {
            public void run() {
                while (!isOpened) {
                    System.out.println("Bottle is closed...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    degas();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }


    private void degas() throws InterruptedException {
            while (this.bubbles.length > 0 && this.isOpened) {
                int count = 0;
                for (double i = 0; i < ((this.getTemperature() * 5 + 10)) && i < this.bubbles.length; i++) {
                    count++;
                    new Bubble("CO2").cramp();
                    this.bubbles = new Bubble[this.bubbles.length - 1];
                }
                System.out.println("Bubbles were pumped in bottle №" + " : " + count);
                isSparkle();
                Thread.sleep(1000);
            }
        }

    public boolean isSparkle() {
        if (this.bubbles.length > 0){
            System.out.println("Bubbles left in bottle: " + this.bubbles.length);
            return true;
        }
        else {
            System.out.println("There are no bubbles in bottle");
            return false;
        }
    }
}