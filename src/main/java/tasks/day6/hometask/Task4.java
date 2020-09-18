package main.java.tasks.day6.hometask;

import java.io.*;
import java.util.Date;

public class Task4 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zyznikdzmitry/Desktop/new/day6/task4/folder/");
        if (file.mkdirs()) {
            System.out.println("Directory is created!");
        } else {
            System.out.println("Directory is not created!");
        }


//        File file1 = new File("/Users/zyznikdzmitry/Desktop/new/day6/task4/folder/","file.txt" );
//
//        if ( ! file1.exists( ) )
//        {
//            file1.createNewFile( );
//        }

//        FileOutputStream fos = new FileOutputStream("t.tmp");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeInt(12345);
//        oos.writeObject("Today");
//        oos.writeObject(new Date());
//        oos.close();

    }
}
