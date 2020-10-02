package main.java.tasks.day8;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        Set<String> myList = new HashSet();
        long start;
        long end;

        start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            String str1 = Integer.toString(i);
            queue.add(str1);
        }
        end = System.currentTimeMillis();
        long t = end - start;
        System.out.println("Queue add: " + t);


        start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            String str1 = Integer.toString(i);
            myList.add(str1);
        }
        end = System.currentTimeMillis();
        t = end - start;
        System.out.println("HashSet add: " + t);


        start = System.currentTimeMillis();
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        end = System.currentTimeMillis();
        t = end - start;
        System.out.println("HashSet return: " + t);


        start = System.currentTimeMillis();
        for (int i = 0; i <queue.size(); i++) {
            queue.poll();
        }
        end = System.currentTimeMillis();
        t = end - start;
        System.out.println("Queue return: " + t);

    }




}