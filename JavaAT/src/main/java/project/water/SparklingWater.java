package main.java.project.water;


import main.java.project.bubbles.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SparklingWater extends Water {
    public boolean condition;
    double value;
    Bubble[] bubbles;
    ArrayList<Bubble> bubblesList;
    boolean warmWater;


    public SparklingWater(boolean condition, double value, int t, boolean warmWater) {
        this.condition = condition;
        this.value = value;
        this.temperature = t;
        this.warmWater = warmWater;
    }


    public void pump(Bubble[] bubbles) throws InterruptedException {
        this.bubbles = bubbles;
//        this.temp = bubbles.length;
        for (int i = 0; i < bubbles.length; i++) {
            this.bubbles[i] = new Bubble();
        }
        this.bubblesList = new ArrayList<>(Arrays.asList(bubbles));
        long startTime = System.nanoTime();
        isOpened();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS) + "seconds");
    }

    public void isOpened() throws InterruptedException {
        int a = 0;
        while (condition == true && bubblesList.size() > 0) {
            if (this.warmWater = true && this.temperature < 41) {
                a = a + 2;
                if (a >= 60) {
                    this.temperature = this.temperature + 0.1;
                    a = 0;
                }
            }
            degas();
            Thread.sleep(2000);
        }
        System.out.println("End temperature" + this.temperature);

    }

    public void degas() {
        for (double i = 0; i < ((this.temperature * 5 + 10) * 2) && i < bubblesList.size(); i++) {
            this.bubblesList.get(bubblesList.size() - 1).boom();
            this.bubblesList.remove(bubblesList.size() - 1);
        }
    }


}
