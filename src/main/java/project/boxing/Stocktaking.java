package main.java.project.boxing;

import java.io.*;

public class Stocktaking {


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
        System.out.println("I am a box with " + vesselBox1.length() + " " + vesselBox1.getType());
//        System.out.println("Size of box is: " + vesselBox1.length());
//        System.out.println("Type of stored data " + vesselBox1.getType());
    }
}

