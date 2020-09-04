package HT.BubbleTask;

import java.util.ArrayList;
import java.util.Arrays;

public class SparklingWater extends Water {
    public boolean condition;
    double value;
    Bubble [] bubbles;
    ArrayList<Bubble> bubblesList;
//    int temp;



    SparklingWater (boolean condition, double value){
        this.condition = condition;
        this.value = value;
    }

    public void pump(Bubble[] bubbles) throws InterruptedException {
        this.bubbles = bubbles;
//        this.temp = bubbles.length;
        for (int i = 0; i < bubbles.length; i++){
            this.bubbles[i] = new Bubble();
        }
        this.bubblesList = new ArrayList<>(Arrays.asList(bubbles));
        isOpened();
    }

    public void isOpened() throws InterruptedException {
        while (condition == true && bubblesList.size() > 0){
            degas();
            Thread.sleep(2000);
        }
    }

    public void degas(){
        for (int i = 1000; i > 0; i--) {
            this.bubblesList.get(bubblesList.size() - 1).boom();
            this.bubblesList.remove(bubblesList.size() - 1);
        }
    }



}
