public class StaticMethod {

    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        System.out.println(StaticMethod.square(5));
    }
}