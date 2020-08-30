package HT.CycleTask;

public class Task_2 {
    public static void main(String[] args) {
        for (int i = 3;  i < 21; i++ ){
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
