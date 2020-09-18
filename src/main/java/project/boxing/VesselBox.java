package main.java.project.boxing;

public class VesselBox<T> extends Vessel {
    private T[] container;
    private int currentPosition;

    public VesselBox(int i){
        if (i == 9) {
            container = (T[]) new Object[9];
            currentPosition = 0;
        }
        if (i == 24){
            container = (T[]) new Object[24];
            currentPosition = 0;
        }
        if (i == 36){
            container = (T[]) new Object[36];
            currentPosition = 0;
        }

        if (i != 9 && i != 24 && i != 36) {
            System.out.println("Wrong size of box");
        }
    }

    public int length(){
        return container.length;
    }

    public void add(T o){
        if (currentPosition < container.length){
            container[currentPosition++] = o;
        }
    }
}
//    public T[] box;
//    public int currentPosition;
//
//    public VesselBox(){
//        box = (T[]) new Object[9];
//        currentPosition = 0;
//    }
//
//    public void add(T o){
//        if (currentPosition < 10){
//            box[currentPosition++] = o;
//        }
//    }
//
//    public void CreateBox24(){
//        box = (T[]) new Object[24];
//        currentPosition = 0;
//    }
//
//    public void CreateBox36(){
//        box = (T[]) new Object[36];
//        currentPosition = 0;
//    }
//}
