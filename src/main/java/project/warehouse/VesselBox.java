package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.util.ArrayList;

public class VesselBox<T> extends Vessel implements Serializable {
    private ArrayList<T> container;
    private int currentPosition;

    private String type;


    public VesselBox(int i) {
        if (i == 9 | i == 24 | i == 36) {
            container = new ArrayList<>(i);
            currentPosition = 0;
            System.out.println("Box created");
        }
        if (i != 9 && i != 24 && i != 36) {
            System.out.println("Wrong size of box");
        }
    }

//    public int length() {
//        return container.length;
//    }

    public void add(int i, T o) {
        for (int j = 0; j < i; j++) {
            container.add(o);
        }
        System.out.println("Add " + o.getClass().getSimpleName() + " in box");
    }

    public String getType() {
        return type;
    }
}


