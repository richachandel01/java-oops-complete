public class Replace {

    public static void main(String[] args) {

        StringBuilder builder =
                new StringBuilder("Java Programming");

        builder.replace(5, 16, "OOP");

        System.out.println(builder);
    }
}