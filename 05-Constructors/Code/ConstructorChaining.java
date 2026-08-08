public class ConstructorChaining {

    String name;
    int age;

    ConstructorChaining() {
        this("Unknown");
    }

    ConstructorChaining(String name) {
        this(name, 0);
    }

    ConstructorChaining(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        ConstructorChaining obj =
                new ConstructorChaining();

        obj.display();
    }
}