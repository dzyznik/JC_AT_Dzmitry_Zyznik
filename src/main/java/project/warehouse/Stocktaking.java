package main.java.project.warehouse;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Stocktaking {
//    private Stocktaking();
private static final Path FILE = Paths.get("/Users/Dzmitry_Zyznik/Desktop/Warehouse/warehouse.txt");
    public static void registerBox(VesselBox box) throws IOException {
        FileOutputStream fos = new FileOutputStream(String.valueOf(FILE));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(box);
        oos.close();
        System.out.println("Box was registered");
    }

    public static void disposeBox(VesselBox box){

    }




    public Stocktaking(VesselBox vesselBox, String boxName) throws IOException, ClassNotFoundException {
        boxName = boxName + ".txt";
        FileOutputStream fos = new FileOutputStream(boxName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(vesselBox);
        oos.close();
        System.out.println("File was created");
        FileInputStream fis = new FileInputStream(boxName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        VesselBox vesselBox1 = (VesselBox) ois.readObject();
        System.out.println("File was read");
//        System.out.println("Size of box is: " + vesselBox1.length());
        System.out.println("Type of stored data: " + vesselBox1.getType());
    }


}

