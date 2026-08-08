class Parent {

    final void display() {

        System.out.println("Final method");
    }
}

public class FinalMethod extends Parent {

    public static void main(String[] args) {

        FinalMethod obj = new FinalMethod();

        obj.display();
    }

    // Cannot override final method
}