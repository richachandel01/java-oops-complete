public class Main {

    static int square(int number) {
        return number * number;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println("Square = " + square(5));

        System.out.println("Is Even = " + isEven(10));
    }
}