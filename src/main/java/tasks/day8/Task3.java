package main.java.tasks.day8;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Set<String> myList = new HashSet();
        Set<String> myList1 = new TreeSet();
        String[] str = "мама мыла раму мыла".split(" ");
        long start;
        long end;

        start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            String str1 = Integer.toString(i);
            myList.add(str1);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            String str1 = Integer.toString(i);
            myList1.add(str1);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        Iterator<String> iterator1 = myList1.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
