public class CopyConstructor {

    String name;
    int age;

    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    CopyConstructor(CopyConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        CopyConstructor s1 =
                new CopyConstructor("Richa", 22);

        CopyConstructor s2 =
                new CopyConstructor(s1);

        s1.display();
        s2.display();
    }
}