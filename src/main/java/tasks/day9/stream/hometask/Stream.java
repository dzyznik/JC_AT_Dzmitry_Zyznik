package main.java.tasks.day9.stream.hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class Stream {
    public static void main(String[] args) {
        //для всех четных значений длин от 1 до 20 дюймов вывести в консоль значения в дюймах, певерести значения в сантиметры и найти сумму
        IntStream.range(1, 20).filter(i -> i % 2 == 0).peek(i -> System.out.println(i + "см"))
                .reduce(Integer::sum).ifPresent(i -> System.out.println(i * 2.54));

//       - сгенерировать List коллекцию целых чисел из n элементов от minValue до maxValue.
//       Определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream
        int minValue = 2;
        int maxValue = 4;
        System.out.println("Содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5? : "
                + IntStream.range(minValue, maxValue).filter(x -> x % 3 == 0 || x % 5 == 0).allMatch(x -> x % 3 == 0 || x % 5 == 0));

        List<? extends Number> foo = new ArrayList<Double>();

        }
        }

