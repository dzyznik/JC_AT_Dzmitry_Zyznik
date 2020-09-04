package HT.BubbleTask;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bottle {
    public double volume;
    String water;

    Bottle(double volume, String water){
        this.volume = volume;
        this.water = water;

    }

    public void open() throws InterruptedException {
        SparklingWater open = new SparklingWater(true, this.volume);
        System.out.println("Bottle is opened");
        Bubble[] b = new Bubble[(int) (this.volume * 10000)];
        open.pump(b);
    }
}
