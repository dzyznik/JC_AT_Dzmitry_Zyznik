package main.java.tasks.day6.hometask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("text.txt"));
        String line;
        String finalLine = "";
        while ((line = in.readLine()) != null) {
            finalLine = finalLine.concat(line);
        }
        in.close();

        String[] words = finalLine.split("\\s+");
        for (int i = 0; i < words.length; i++) {
        }
        System.out.println(words.length + " words in string");
        int marks = 0;
        for (int i = 0; i < finalLine.length(); i++) {
            if (finalLine.charAt(i) == '!' || finalLine.charAt(i) == ',' || finalLine.charAt(i) == ';' || finalLine.charAt(i) == '.' || finalLine.charAt(i) == '?' || finalLine.charAt(i) == '-' || finalLine.charAt(i) == '\'' || finalLine.charAt(i) == '\"' || finalLine.charAt(i) == ':') {
                marks++;
            }
        }
        System.out.println(marks + " marks in string");
    }
}


