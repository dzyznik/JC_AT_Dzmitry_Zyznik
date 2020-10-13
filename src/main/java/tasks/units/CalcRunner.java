package main.java.tasks.units;

public class CalcRunner {
    public static void main(String[] args) throws TestException {
        CalcTest calcTest = new CalcTest();

        calcTest.addTest();
        calcTest.subtractTest();
        calcTest.multiplyTest();
        calcTest.divideTest();
    }
}
