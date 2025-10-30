package Recursion;

public class BasicEg {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hi");
        message1();
    }

    static void message1() {
        System.out.println("Hi 1");
        message2();
    }

    static void message2() {
        System.out.println("Hi 2");
        message3();
    }

    static void message3() {
        System.out.println("Hi 3");
        message4();
    }

    static void message4() {
        System.out.println("Hi 4");
    }
}
