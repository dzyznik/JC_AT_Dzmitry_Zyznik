package main.java.project.warehouse;

import java.util.Map;

public class Warehouse {
    private Map<Integer, VesselBox> stock;

    public void addBox(VesselBox box) {
        stock.put(box.getId(), box);
        System.out.println("Box was added");
    }

    public void getBox(int id) {
        System.out.println(stock.get(id));
    }

    public void removeBox(int id) {
        stock.remove(id);
        System.out.println("Box was removed");
    }

}




