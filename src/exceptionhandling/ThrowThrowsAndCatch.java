package exceptionhandling;

public class ThrowThrowsAndCatch {

    public static void f1() {
        System.out.println("F1");
        f2();
    }

    public static void f2() {
        System.out.println("F2");
        f3();
    }

    public static void f3() {
       int n=0;
        n=1/n;
        System.out.println("F3");
    }
    

    public static void main(String[] args) {
       f1();
    }

}
