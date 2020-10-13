package main.java.tasks.day12;

import java.util.concurrent.atomic.AtomicLong;

public class Thread3 {
    static long l;
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        AtomicLong co = new AtomicLong();
        Thread t1 = new Thread(() -> {
//            synchronized (lock) {
                for (int i = 0; i < 1000000; i++) {
//                    l++;
                    co.incrementAndGet();
                }
//            }
        });

        Thread t2 = new Thread(() -> {
//            synchronized (lock) {
                for (int i = 0; i < 1000000; i++) {
//                    l--;
                    co.decrementAndGet();
                }
//            }
        });
        t1.start();
        t2.start();
        t2.join();

        System.out.println(co.get());

    }
}
