package main.java.tasks.day7;

public class ConstantRunner {
    public static void main(String[] args) {
        Color c1 = new Color(1, "red");
        Color c2 = new Color(1, "red");



        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }

    static private void ifColor(String color) {
        String aColor = color;
        switch (color) {
            case ConstantContainer.RED:
                System.out.println(ConstantContainer.RED);
                break;
            case ConstantContainer.BLUE:
                System.out.println(ConstantContainer.BLUE);
                break;
            case ConstantContainer.GREEN:
                System.out.println(ConstantContainer.GREEN);
                break;
            case ConstantContainer.YELLOW:
                System.out.println(ConstantContainer.YELLOW);
                break;
            case ConstantContainer.PURPLE:
                System.out.println(ConstantContainer.PURPLE);
                break;
        }
    }


    static private void ifColor1(String color) {
        String aColor = color;
        if (color == ColorContainer.BLUE.colorName) {
            System.out.println(ColorContainer.BLUE.colorName);
        }
        if (color == ColorContainer.RED.colorName) {
            System.out.println(ColorContainer.RED.getColorName());
        }
        if (color == ColorContainer.GREEN.colorName) {
            System.out.println(ColorContainer.GREEN.getColorName());
        }
        if (color == ColorContainer.YELLOW.colorName) {
            System.out.println(ColorContainer.YELLOW.getColorName());
        }
        if (color == ColorContainer.PURPLE.colorName) {
            System.out.println(ColorContainer.PURPLE.getColorName());
        }
        if (!color.equals(ColorContainer.BLUE.colorName) && !color.equals(ColorContainer.RED.colorName) && !color.equals(ColorContainer.GREEN.colorName) && !color.equals(ColorContainer.YELLOW.colorName) && !color.equals(ColorContainer.PURPLE.colorName)) {
            System.out.println("There is no that color");
        }
    }



        private static void ifColor2(int hash){
            int aHash = hash;
            if (hash == ColorContainer.BLUE.hash) {
                System.out.println(ColorContainer.BLUE.getHash());
            }
            if (hash == ColorContainer.RED.hash) {
                System.out.println(ColorContainer.RED.getHash());
            }
            if (hash == ColorContainer.GREEN.hash) {
                System.out.println(ColorContainer.GREEN.getHash());
            }
            if (hash == ColorContainer.YELLOW.hash) {
                System.out.println(ColorContainer.YELLOW.getHash());
            }
            if (hash == ColorContainer.PURPLE.hash) {
                System.out.println(ColorContainer.PURPLE.getHash());
            } else {
                System.out.println("There is no that color");
            }
        }

    }
