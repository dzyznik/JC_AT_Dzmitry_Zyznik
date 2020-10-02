package main.java.tasks.day8;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        String text = "Мама мыла раму";
        String[] array = text.split(" ");
        for (int i = 0; i < array.length ; i++) {
            myList.add(array[i]);
        }

        for (int i = 0; i < myList.size() ; i++) {
            System.out.println(myList.get(i));
        }

        for (String word : myList){
            System.out.println(word);
        }

    }
}
