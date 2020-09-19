package main.java.tasks.day6.hometask;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month (For ex. September)");
        String month = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM");
        Date date = formatter.parse(month);
        DateFormat dateFormat = new SimpleDateFormat("M");
        String monthNum = dateFormat.format(date);
        int num = Integer.parseInt(monthNum);
        num++;
        String newMonth = Integer.toString(num);
        SimpleDateFormat formatter1 = new SimpleDateFormat("M");
        Date newDate = formatter1.parse(newMonth);
        System.out.printf("%tB", newDate);

    }
}
