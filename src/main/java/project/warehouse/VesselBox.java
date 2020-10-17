package main.java.project.warehouse;

import main.java.project.vessel.Containable;
import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class VesselBox<T> extends Vessel implements Serializable {
    private List<Containable> box;
    private int capacity;
    private String name = "I am box with " + capacity + " " + box.get(0).getClass().getSimpleName();
    private int id;

    public List<Containable> getBox() {
        return box;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {       //Don't understand
        return true;
    }

    public int hashCode() {                //Don't understand
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public VesselBox(String name, List<Containable> box) {
        capacity = box.size();
        if (capacity == 9 | capacity == 24 | capacity == 36) {
            id++;
            this.name = name;
            this.box = box;
        } else
            System.out.println("Wrong size of box");
    }

}


