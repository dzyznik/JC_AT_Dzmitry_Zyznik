package main.java.project.warehouse;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Stocktaking {

    private static final Path FILE = Paths.get("/Users/Dzmitry_Zyznik/Desktop/Warehouse/warehouse.txt");

    private Stocktaking() {

    }

    public static void registerBox(VesselBox box) throws IOException {
        FileOutputStream fos = new FileOutputStream(String.valueOf(FILE));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.write(box.hashCode());
        oos.writeBytes(box.getName());
        oos.close();
        System.out.println("Box was registered");
    }

    public static void disposeBox(VesselBox box) {

    }


    public void getInfo() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(String.valueOf(FILE));
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
    }


}

