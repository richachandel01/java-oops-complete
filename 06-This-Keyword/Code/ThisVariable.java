public class ThisVariable {

    String name;
    int age;

    ThisVariable(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        ThisVariable obj =
                new ThisVariable("Richa", 22);

        obj.display();
    }
}