package main.java.tasks.day11;

import java.util.stream.IntStream;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
//            IntStream.range(0,100).forEach(i -> System.out.println("t1 " + i));
//            Thread.yield();
            heavyMethod();
        });

        Thread t2 = new Thread(() -> {
//            IntStream.range(0,100).forEach(i -> System.out.println("t2 " + i));
            heavyMethod();
        });

        Thread t3 = new Thread(() -> {
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            IntStream.range(0,100).forEach(i -> System.out.println("t3 " + i));
            heavyMethod();
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);


        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
        t3.start();
//        t3.join();
        System.out.println("Main is finished");

//        for (int i = 0; i < 3; i++) {
//            new Thread(() -> {
//                heavyMethod();
//            }).start();
//        }


    }

    public static synchronized void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(), (System.currentTimeMillis() - t0));
    }
}
