package main.java.project.boxing;

public class VesselBox<T> extends Vessel {
    public T[] container;
    private int currentPosition;

    public void CreateBox9(){
        container = (T[]) new Object[9];
        currentPosition = 0;
    }

    public void CreateBox24(){
        container = (T[]) new Object[24];
        currentPosition = 0;
    }

    public void CreateBox36(){
        container = (T[]) new Object[36];
        currentPosition = 0;
    }
}
