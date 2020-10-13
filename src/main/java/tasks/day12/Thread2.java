package main.java.tasks.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Thread2 {
    static int sum = 0;
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
//        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (map) {
                for (int i = 0; i < 10000; i++) {
                    map.put(i, i + 1);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (map) {
                for (int i = 0; i < 10000; i++) {
                    map.forEach((i1, i2) -> sum += i2);
                }
            }
        });

        t1.start();
        t2.start();
        t2.join();

        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
