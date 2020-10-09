package main.java.tasks.day9.stream.hometask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        //для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму
        List<Double> list = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            list.add((double) i);
        }

        System.out.println(list.stream().filter(i -> i % 2 == 0).peek(i -> System.out.println(i + "см")).reduce((i1,i2) -> (i1 + i2) * 2.54).get() + " дюймов");

    }
}
