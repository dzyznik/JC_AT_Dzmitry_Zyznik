package main.java.tasks.day6;

public class B {

    public static void main(String[] args) {
        C a = new C();
        a.foo(5);

        A a2 = new A(){
            public int foo(int x){
                int y = x * 5;
                System.out.println(y);
                return y;
            }
        };
        a2.foo(6);

        IntA aa = new IntA() {
            public void foo(){
                System.out.println("hhh");
            }
        };
        aa.foo();
    }
}
