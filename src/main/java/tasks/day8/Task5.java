package main.java.tasks.day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap();
        String[] str = "мама мыла раму мыла".split(" ");
        int i = 1;
        for (String word : str){
            words.put(i,word);
            i++;
        }
        System.out.println("Map :" + words);

        for ( int j : words.keySet()){
            System.out.println(j);
        }

        for (String s : words.values()){
            System.out.println(s);
        }


        for (Map.Entry<Integer, String> entry : words.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }



    }
}
