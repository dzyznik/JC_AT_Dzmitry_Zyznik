package HT.BubbleTask;

public class SparklingWater extends Water {
    public boolean condition;
    double value;
    Bubble [] bubbles;
    int temp;
    public int t;


    SparklingWater (boolean condition, double value, int t){
        super(t);
        this.condition = condition;
        this.value = value;
    }

    public void pump(Bubble[] bubbles) throws InterruptedException {
        this.bubbles = bubbles;
        this.temp = bubbles.length;
        for (int i = 0; i < bubbles.length; i++){
            this.bubbles[i] = new Bubble();
        }
        isOpened();
        }

    public void isOpened() throws InterruptedException {
        while (condition == true && this.temp > 0){
            degas();
            Thread.sleep(2000);
        }
    }

    public void degas(){
        this.bubbles[this.temp - 1].boom();
        this.bubbles[this.temp - 1] = null;
        this.temp --;
    }



}
