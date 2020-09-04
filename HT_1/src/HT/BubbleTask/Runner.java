package HT.BubbleTask;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        //⁃ в нем создать 3 бутылки, объёмом 0.5, 1, 1.5 лира с газировкой
        //- открыть поочередно все бутылки и выпустить из них газ
        Bottle bottle1 = new Bottle(0.5, "Sparkling");
        Bottle bottle2 = new Bottle(1, "Sparkling");
        Bottle bottle3 = new Bottle(1.5, "Sparkling");
        bottle1.open();
        bottle2.open();
        bottle3.open();




    }
}
