package main.java.tasks.day1;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[] mass = new int[7]; //создать пустой массив типа int и размера n = 7
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {  //заполнить его случайными элементами используя Random.nextInt(n)
            mass[i] = rand.nextInt(100);
        }
        for (int k : mass) {     //пройти по массиву и вывести все элементы
            System.out.print(k + " ");
        }
        System.out.println();
        for (int i = mass.length - 1; i >= 0; i--) {         // вывести все элементы в обратном порядке
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int k : mass) {      // каждый элемент умножить на 5 и вывести результат
            System.out.print(k * 5 + " ");
        }
        System.out.println();
        for (int k : mass) {      // каждый элемент возвести в квадрат и вывести результат
            System.out.print(Math.pow(k, 2) + " ");
        }
        System.out.println();
        int min = mass[0];
        for (int k : mass) {      // найти минимальный элемент массива и вывести результат
            if (min > k) {
                min = k;
            }
        }
        System.out.print(min);
        System.out.println();

        for (int i = 0; i < mass.length; i++) {    //поменять местами первый и последний элементы и вывести результат
            if (i == 0) {
                System.out.print(mass[mass.length - 1] + " ");
            }
            if (i == mass.length - 1) {
                System.out.print(mass[0] + " ");
            } if (i != 0 && i != mass.length - 1) {
                System.out.print(mass[i] + " ");
            }

        }
        System.out.println();
        for (int i = mass.length - 1; i > 0; i--) {     //отсортировать элементы массива в порядке убывания (любым способом)
            for (int j = 0; j < i; j++){
                if (mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        for (int j : mass) {
            System.out.print(j + " ");
        }


    }
}

