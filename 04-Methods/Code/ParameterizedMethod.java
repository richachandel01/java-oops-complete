public class ParameterizedMethod {

    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {

        ParameterizedMethod obj = new ParameterizedMethod();

        obj.greet("Richa");
        obj.greet("Rahul");
    }
}