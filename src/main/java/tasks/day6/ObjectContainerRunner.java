package main.java.tasks.day6;

import java.util.Arrays;
import java.util.Random;

public class ObjectContainerRunner {
    public static void main(String[] args) {
        Random rnd = new Random();
        Object [] container = new Object[10];
        ObjectContainer c = new ObjectContainer(container);
        for (int i = 0; i < container.length; i++) {
            c.add(rnd.nextInt(100));
        }
        System.out.println(Arrays.toString(container));
        c.removeLast();
        System.out.println(container);
        c.isEmpty();




    }



}
