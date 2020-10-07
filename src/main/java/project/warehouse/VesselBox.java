package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

import java.io.Serializable;

public class VesselBox<T> extends Vessel implements Serializable {
    private T[] container;
    private int currentPosition;

    private String type;


    public VesselBox(int i) {
        if (i == 9) {
            container = (T[]) new Object[9];
            currentPosition = 0;
        }
        if (i == 24) {
            container = (T[]) new Object[24];
            currentPosition = 0;
        }
        if (i == 36) {
            container = (T[]) new Object[36];
            currentPosition = 0;
        }

        if (i != 9 && i != 24 && i != 36) {
            System.out.println("Wrong size of box");
        }
    }

    public int length() {
        return container.length;
    }

    public void add(T o) {
        if (currentPosition < container.length) {
            container[currentPosition++] = o;
        }
        this.type = o.getClass().getSimpleName();
        System.out.println("Add " + o.getClass().getSimpleName() + " in box");
    }

    public String getType() {
        return type;
    }
}


