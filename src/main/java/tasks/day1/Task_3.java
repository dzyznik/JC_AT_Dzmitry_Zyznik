package main.java.tasks.day1;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[] mass = new int[7]; //создать пустой массив типа int и размера n = 7
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {  //заполнить его случайными элементами используя Random.nextInt(n)
            mass[i] = rand.nextInt(100);
        }
        for (int i = 0; i < mass.length; i++) {     //пройти по массиву и вывести все элементы
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = mass.length - 1; i >= 0; i--) {         // вывести все элементы в обратном порядке
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {      // каждый элемент умножить на 5 и вывести результат
            System.out.print(mass[i] * 5 + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {      // каждый элемент возвести в квадрат и вывести результат
            System.out.print(Math.pow(mass[i], 2) + " ");
        }
        System.out.println();
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {      // найти минимальный элемент массива и вывести результат
            if (min > mass[i]) {
                min = mass[i];
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
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }


    }
}

