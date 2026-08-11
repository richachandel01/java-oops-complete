public class FinalReference {

    public static void main(String[] args) {

        final StringBuilder builder =
                new StringBuilder("Java");

        builder.append(" OOP");

        System.out.println(builder);

        // builder = new StringBuilder("New");
        // Not allowed because the reference is final.
    }
}