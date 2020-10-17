package main.java.project.warehouse;

import main.java.project.vessel.Containable;
import main.java.project.vessel.Vessel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VesselBox<T> extends Vessel implements Serializable {
    private List <Containable> box;
    private int capacity;
    private String name = "I am box with " + capacity + " " + box.get(0).getClass().getSimpleName();
    private long id;

    public List<Containable> getBox() {
        return box;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public boolean equals(Object o){
        return true;
    }

    public int hashCode(){
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public VesselBox(String name, List<Containable> box){
        this.name = name;
        this.box = box;
    }

}


