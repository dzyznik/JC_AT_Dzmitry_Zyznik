package main.java.tasks.day7.enums;

import main.java.tasks.day7.ConstantContainer;

public class EnumColorRunner {

    static private void ifColor(String color) {
        
        switch (Color.valueOf(color)) {
            case BLUE:
                System.out.println(Color.BLUE);
                break;
            case RED:
                System.out.println(Color.RED);
                break;
            case GREEN:
                System.out.println(Color.GREEN);
                break;
            case YELLOW:
                System.out.println(Color.YELLOW);
                break;
            case PURPLE:
                System.out.println(Color.PURPLE);
                break;
        }
    }

}
