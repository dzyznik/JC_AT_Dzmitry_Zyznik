
package main.java.tasks.day5;

import java.util.Arrays;

//найти и вывести в консоль все дубликаты слов в строке текста, коллекции и потоки не использовать
public class StringTask1 {
    public static void main(String[] args) {
        String str = "Peremen! - trebuyut nashi serdca. Peremen! - trebuyut nashi glaza. V nashem smehe i v nashih slezah, i v pulsacii ven: Peremen! Mi jdem peremen!";
        String[] words = str.split("\\W");
        System.out.println(Arrays.toString(words));


        for (int i = 0; i < words.length - 1; i++) {
            int k = 1;
            if (words[i].equals(""))
                continue;
            for (int j = i + 1; j < words.length - 1; j++) {
                if ((words[i].equals(words[j])) && (i != j)) {
                    words[j] = "";
                    k++;
                }
            }
            if (k > 1)
                System.out.println("Duplicate Element is : " + words[i] + " repeated " + k + " times");
        }

    }
}