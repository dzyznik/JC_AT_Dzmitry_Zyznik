package main.java.project.boxing;

import java.io.*;

public class Stocktaking {


    public Stocktaking(VesselBox vesselBox, String boxName) throws IOException {
        boxName = boxName + ".txt";
        FileOutputStream fos = new FileOutputStream(boxName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(vesselBox);
        oos.close();
    }
}

