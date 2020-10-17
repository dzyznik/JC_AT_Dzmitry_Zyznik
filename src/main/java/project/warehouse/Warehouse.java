package main.java.project.warehouse;

import java.util.Map;

public class Warehouse {
    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) {
        int i = stock.size() + 1;
        stock.put(i, box);
        System.out.println("Box was added");
    }

    public void getBox(){

    }

    public void removeBox(){
        VesselBox keyToRemove = stock.remove(stock.size()-1);
        stock.remove(keyToRemove);
        System.out.println("Box was removed");
    }



}




