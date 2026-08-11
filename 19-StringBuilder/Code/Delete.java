public class Delete {

    public static void main(String[] args) {

        StringBuilder builder =
                new StringBuilder("Java Programming");

        builder.delete(5, 17);

        System.out.println(builder);
    }
}