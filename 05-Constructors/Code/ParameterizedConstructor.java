public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ParameterizedConstructor student =
                new ParameterizedConstructor("Richa", 22);

        student.display();
    }
}