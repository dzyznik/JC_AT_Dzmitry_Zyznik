package main.java.project.stuff;

import java.io.Serializable;
import java.util.List;

public class SparklingWater extends Water implements Serializable {
    private boolean isOpened;
    private List<Bubble> bubbles;

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

    public void pump(List<Bubble> bubbles, int bubblesCount) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubblesCount; i++) {
            this.bubbles.add(new Bubble("CO2"));
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
            while (this.bubbles.size() > 0 && this.isOpened) {
                int count = 0;
                for (double i = 0; i < ((this.getTemperature() * 5 + 10)) && i < this.bubbles.size(); i++) {
                    count++;
                    this.bubbles.get((int) i).cramp();
                    this.bubbles.remove(this.bubbles.size() - 1);
                }
                System.out.println("Bubbles were pumped in bottle №" + " : " + count);
                isSparkle();
                Thread.sleep(1000);
            }
        }

    public boolean isSparkle() {
        if (this.bubbles.size() > 0){
            System.out.println("Bubbles left in bottle: " + this.bubbles.size());
            return true;
        }
        else {
            System.out.println("There are no bubbles in bottle");
            return false;
        }
    }
}