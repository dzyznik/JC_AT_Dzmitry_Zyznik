package main.java.project.water;

import main.java.project.structure.Bubble;


//SparklingWater:
//------ + наследуется от Water
//------ + содеждит приватные поля boolean isOpened, Bubble[] bubbles
//------ + содержит конструктор SparklingWater(), который вызывает внутренний метод isOpened();
//------ + есть публичный метод void pump(Bubble[] bubbles), который сетает массив из пузырьков в воду
//------ + есть публичный метод void setOpened(boolean isOpened), который меняет состояние воды на "открытое"
//------ + есть публичный метод void checkIsOpened(), который в новом потоке проверят состояние воды на "открытость" и в случае, если она открыта запускает метод degas()
//------ + есть приватный метод degas(), который каждую секунду выпускает по партии пузырьков из рассчета 10 + 5 * температура_воды
//------ + есть публичный метод boolean isSparkle(), возвращающий true если в воде еще есть пузырьки газа
public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;
    private boolean warmWater;

    public void setWarmWater(boolean warmWater) {
        this.warmWater = warmWater;
    }

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        this.setColor(color);
    }

    public SparklingWater() {
        isOpened();
    }

    private void isOpened() {
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            this.bubbles[i] = new Bubble("CO2");
        }

    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        checkIsOpened();
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
        int time = 0;
        while (this.bubbles.length > 0 && this.isOpened) {
            if (this.warmWater && this.getTemperature() < 41) {
                time++;
                if (time > 60) {
                    int temperature = this.getTemperature();
                    temperature++;
                    this.setTemperature(temperature);
                    System.out.println("Temperature is set to: " + temperature);
                    time = 0;
                }
            }
            int count = 0;
            for (double i = 0; i < ((this.getTemperature() * 5 + 10)) && i < this.bubbles.length; i++) {
                count++;
                new Bubble("CO2").cramp();
                this.bubbles = new Bubble[this.bubbles.length - 1];
            }
            if (this.bubbles.length > 0) {
                isSparkle();
            }
            System.out.println("Bubbles were pumped in bottle №" + " : " + count);
            System.out.println("Bubbles left in bottle №" + " : " + this.bubbles.length);
            Thread.sleep(1000);
        }
    }

    public boolean isSparkle() {
        return true;
    }
}