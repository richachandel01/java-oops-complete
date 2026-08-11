public class MutableVsImmutable {

    public static void main(String[] args) {

        String immutable = "Java";

        immutable.concat(" OOP");

        System.out.println(immutable);

        StringBuilder mutable =
                new StringBuilder("Java");

        mutable.append(" OOP");

        System.out.println(mutable);
    }
}