package main.java.project.boxing;

import javafx.scene.paint.Material;
import main.java.project.bubbles.Bubble;
import main.java.project.water.SparklingWater;


//Bottle:
//------+ содеждит приватные поля double volume, SparklingWater water
//------ + содержит конструктор Bottle(double volume), в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
//------ + есть публичный метод void open(), который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
//------ + есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
//------ + есть публичный метод SparklingWater getWater() возвращающий обьект воды
//------ + есть публичный метод setWater(SparklingWater water) добавляющий новый обьект воды
public class Bottle extends Vessel {


    private double volume;
    private SparklingWater water;

    public double getVolume() {
        return volume;
    }

    public Bottle(double volume) {
        this.volume = volume;
        Bubble[] b = new Bubble[(int) (this.volume * 10000)];
        water = new SparklingWater();
        water.pump(b);
        System.out.println("New bottle is created");
    }

    public Bottle(double volume, double diameter, int weight, Material material){
        setVolume(volume);
        setDiameter(diameter);
        setWeight(weight);
        setMaterial(material);
    }

    public void open() {
        water.setOpened(true);
        System.out.println("Bottle is opened");
    }

    public void closed() {
        water.setOpened(false);
        System.out.println("Bottle is closed");
    }


    public void warm(int temperature) {
        water.setTemperature(temperature);
        System.out.println("Temperature is set to " + temperature);
    }

    public void water(String color, String transparency, String smell, int temperature) {
        water.setColor(color);
        water.setTransparency(transparency);
        water.setSmell(smell);
        water.setTemperature(temperature);
        System.out.println("Color is set to " + color);
        System.out.println("Transparency is set to " + transparency);
        System.out.println("Smell is set to " + smell);
        System.out.println("Temperature is set to " + temperature);
    }

    public void warmWater(boolean warmWater) {
        water.setWarmWater(warmWater);
        if (warmWater) {
            System.out.println("Bottle is started warming");
        }
    }

    public SparklingWater getWater() {
        return water;
    }

    public void setWater(SparklingWater water) {
        this.water = water;
    }
}