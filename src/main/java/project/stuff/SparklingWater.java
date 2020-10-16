package main.java.project.stuff;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SparklingWater extends Water implements Serializable {
    private boolean isOpened;
    private List<Bubble> bubbles;

    public SparklingWater(double volume) {
        double bubblesCount = 10000 * volume;
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < bubblesCount; i++){
            bubbles.add(new Bubble());
        }
        System.out.println("Pumping water with bubbles: " + bubbles.size());
        this.bubbles = bubbles;
        isOpened();
    }

    public void setOpened() {
        this.isOpened = true;
    }

    private void isOpened() {
        Thread thread = new Thread() {
            public void run() {
                while (!isOpened) {
                    System.out.println("Bottle is closed..");
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

        System.out.println("Starting degase..");
        while (bubbles.size() != 0) {

            int bunch = 10 + 5 * this.getTemperature();
            System.out.println("bunch is: " + bunch);
            if (bubbles.size() > bunch) {
                for (int i = 0; i < bunch && i < bubbles.size(); i++) {
                    bubbles.get(i).cramp();
                    bubbles.remove(i);
                }
            }
            else {
                for (int i = 0; i < bubbles.size(); i++) {
                    bubbles.get(i).cramp();
                    bubbles.remove(i);
                }
                break;
                }
            Thread.sleep(1000);
        }
        System.out.println("Bubbles length is: " + bubbles.size());
    }


    @Override
    public void mix() {

    }

//    public void warm(int temperature) {
//        Thread thread = new Thread() {
//            public void run() {
//                setTemperature(temperature - 1);
//                while (getTemperature() < 42) {
//                    if (getTemperature() < 41) {
//                        setTemperature(getTemperature() + 1);
//                        System.out.println("Temperature is set to: " + getTemperature());
//                    }
//                    try {
//                        Thread.sleep(10000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        thread.start();
//    }
}