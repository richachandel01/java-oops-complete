public class ConstructorOverloading {

    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    ConstructorOverloading(String name) {
        this.name = name;
        age = 0;
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        new ConstructorOverloading().display();
        new ConstructorOverloading("Richa").display();
        new ConstructorOverloading("Richa", 22).display();
    }
}