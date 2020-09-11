package main.java.tasks.day5;

import java.util.Arrays;

//-- найти в тексте все цифры и преобразовать их в массив числовых переменных, вывести все элементы массива в консоль
public class StringTask2 {
    public static void main(String[] args) {
        String str = "The city proper covers 49 square miles (127 km2) with an estimated population of 692,600 in 2019,[4] also making it the most populous city in New England,[3] and is the seat of Suffolk County (although the county government was disbanded on July 1, 1999).";
        str = str.replaceAll("[^0-9]+", " ");
        str = str.trim();
        String[] digitsStr = str.split(" ");
        int[] digitsInt = Arrays.stream(digitsStr).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < digitsInt.length; i++) {
            System.out.println(digitsInt[i]);
        }
    }
}