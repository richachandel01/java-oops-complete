public class MethodOverloading {

    void display(int number) {

        System.out.println("Integer: " + number);
    }

    void display(String text) {

        System.out.println("String: " + text);
    }

    public static void main(String[] args) {

        MethodOverloading obj =
                new MethodOverloading();

        obj.display(10);
        obj.display("Java");
    }
}