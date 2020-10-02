package main.java.tasks.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2
{
    public static void main(String[] args) {


    List<String> myList1 = new ArrayList();
    List<String> myList2 = new LinkedList();
    String str = "";

    long start = System.currentTimeMillis();
        for (int i = 0; i < 100001 ; i++) {
            myList1.add(str);
        }
        long end = System.currentTimeMillis();
        long t = end - start;


        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100001 ; i++) {
            myList2.add(str);
        }
        long end1 = System.currentTimeMillis();
        long t1 = end1 - start1;

        System.out.println(t);
        System.out.println(t1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
            myList1.get(i);
        }
        long end2 = System.currentTimeMillis();
        long t2 = end2 - start2;
        System.out.println(t2);

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < myList1.size(); i++) {
            myList2.get(i);
        }
        long end3 = System.currentTimeMillis();
        long t3 = end3 - start3;
        System.out.println(t3);

}
}
