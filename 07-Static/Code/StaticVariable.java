public class StaticVariable {

    static String college = "PSIT";

    String name;

    StaticVariable(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }

    public static void main(String[] args) {

        StaticVariable s1 = new StaticVariable("Richa");
        StaticVariable s2 = new StaticVariable("Rahul");

        s1.display();
        s2.display();
    }
}