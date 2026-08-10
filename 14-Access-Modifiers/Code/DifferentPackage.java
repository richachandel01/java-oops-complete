package differentpackage;

public class DifferentPackage {

    public static void main(String[] args) {

        samepackage.SamePackage obj =
                new samepackage.SamePackage();

        System.out.println(obj.value);

        // protectedValue and defaultValue
        // are not directly accessible here.
    }
}