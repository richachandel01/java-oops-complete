public class Child extends Parent {

    void displayChild() {

        System.out.println("Child");
    }

    public static void main(String[] args) {

        Child obj = new Child();

        obj.displayParent();
        obj.displayChild();
    }
}