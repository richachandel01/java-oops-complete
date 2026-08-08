public class ConstructorChaining {

    ConstructorChaining() {

        this(10);
    }

    ConstructorChaining(int number) {

        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        new ConstructorChaining();
    }
}