package main.java.tasks.units;

public class CalcTest {
    Calc calc = new Calc();

    public void addTest() throws TestException {

       if (calc.add(2,3) != 5) {
           throw  new TestException();
        } else {
           System.out.println("Test passed");
       }
    }
    public void subtractTest() throws TestException {

        if (calc.subtract(3,2) != 1) {
            throw  new TestException();
        } else {
            System.out.println("Test passed");
        }
    }
    public void multiplyTest() throws TestException {

        if (calc.multiply(2,3) != 6) {
            throw  new TestException();
        } else {
            System.out.println("Test passed");
        }
    }
    public void divideTest() throws TestException {

        if (calc.divide(6,3) != 2) {
            throw  new TestException();
        } else {
            System.out.println("Test passed");
        }
    }
}
