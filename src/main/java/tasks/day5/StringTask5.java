package main.java.tasks.day5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//-- написать метод, который принимает на вход строку с датой и временем в формате
// "22.00 07.09.2020" и выводит в консоль в формате "September, 7, 2020 22:00"
public class StringTask5 {
    public static void main(String[] args) throws ParseException {
        String date = "22.00 07.09.2020";
        Date date1 = new SimpleDateFormat("k.m dd.MM.yyyy").parse(date);
        System.out.printf("%1$tB, %1$td, %1$tY %1$tH:%1$tM", date1);
    }
}