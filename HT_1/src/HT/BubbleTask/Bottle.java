package HT.BubbleTask;

public class Bottle {
    public double volume;
    String water;
    int t;

    Bottle(double volume, String water,int temperature){
        this.volume = volume;
        this.water = water;
        this.t = temperature;

    }

    public void open() throws InterruptedException {
        SparklingWater open = new SparklingWater(true, this.volume, this.t);
        System.out.println("Bottle is opened");
        Bubble[] b = new Bubble[(int) (this.volume * 10000)];
        open.pump(b);
    }
}
