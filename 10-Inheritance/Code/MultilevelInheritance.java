class Grandparent {

    void grandparentMethod() {

        System.out.println("Grandparent");
    }
}

class ParentClass extends Grandparent {

    void parentMethod() {

        System.out.println("Parent");
    }
}

public class MultilevelInheritance extends ParentClass {

    void childMethod() {

        System.out.println("Child");
    }

    public static void main(String[] args) {

        MultilevelInheritance obj =
                new MultilevelInheritance();

        obj.grandparentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}