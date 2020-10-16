package main.java.project.warehouse;

import main.java.project.vessel.Vessel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Factory {
    VesselBox<Vessel> box;
    int count;
    Warehouse warehouse;
    String boxName;

    public void createVesselBox(String boxName, int count) {
        VesselBox<Vessel> box = new VesselBox<>(count);
        this.box = box;
        this.count = count;
        this.boxName = boxName;
    }

    public void addVessels(Vessel vessel) {
        box.add(this.count, vessel);
    }

    public void storeBox(VesselBox box) throws IOException, ClassNotFoundException {
        warehouse.addBox(box);
        Stocktaking stocktaking = new Stocktaking(box, boxName);
    }

    public void createVessels(Vessel vessel, int count) {
        List<Vessel> container = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Vessel vessel1 = new Vessel() {
                @Override
                public void setVolume(double volume) {
                    super.setVolume(vessel.getVolume());
                }

                @Override
                public void setDiameter(double diameter) {
                    super.setDiameter(vessel.getDiameter());
                }

                @Override
                public void setWeight(int weight) {
                    super.setWeight(vessel.getWeight());
                }

                @Override
                public void setMaterial(Material_cl material) {
                    super.setMaterial(vessel.getMaterial());
                }
            };
            container.add(vessel1);
        }

    }


}
