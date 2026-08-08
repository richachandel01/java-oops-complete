public class ThisMethod {

    void firstMethod() {

        System.out.println("First method");

        this.secondMethod();
    }

    void secondMethod() {

        System.out.println("Second method");
    }

    public static void main(String[] args) {

        ThisMethod obj = new ThisMethod();

        obj.firstMethod();
    }
}