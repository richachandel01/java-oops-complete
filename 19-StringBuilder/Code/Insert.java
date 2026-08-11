public class Insert {

    public static void main(String[] args) {

        StringBuilder builder =
                new StringBuilder("Java Programming");

        builder.insert(5, "OOP ");

        System.out.println(builder);
    }
}