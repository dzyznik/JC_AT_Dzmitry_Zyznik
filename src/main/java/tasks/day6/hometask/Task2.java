package main.java.tasks.day6.hometask;

import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        File folder = new File("/Users/zyznikdzmitry/Desktop/Java");
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
        }
    }
}
