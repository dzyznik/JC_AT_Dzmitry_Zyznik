package main.java.project.bubbles;

//Bubble:
//        ------ + содеждит приватные поля double volume = 03, String gas;
//        ------ + содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
//        ------ + есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
//        ------ + есть публичный метод double getVolume(), возвращающий обьем пузырька
public class Bubble {
    private double volume = 0.3;
    private String gas;

    public Bubble(String gas) {

    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return volume;
    }
}