public class StaticNestedClass {

    static class Helper {

        void display() {
            System.out.println("Static nested class");
        }
    }

    public static void main(String[] args) {

        StaticNestedClass.Helper obj =
                new StaticNestedClass.Helper();

        obj.display();
    }
}