public class StringImmutability {

    public static void main(String[] args) {

        String name = "Java";

        name.concat(" Programming");

        System.out.println(name);

        name = name.concat(" Programming");

        System.out.println(name);
    }
}