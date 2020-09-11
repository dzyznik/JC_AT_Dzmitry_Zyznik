package main.java.tasks.day5;

//-- написать метод, который выводит в коноль текущую дату и время в формате ниже:
//Сейчас на дворе:
//19 сентября, 2020, 3 часа 13 минут
import java.util.Date;

public class StringTask4 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("%1$s %2$td %2$tB, %2$tY, %2$tH часа %2$tM минут", "Сейчас на дворе:\n",date);

    }
}