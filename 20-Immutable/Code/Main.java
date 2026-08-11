public class Main {

    public static void main(String[] args) {

        ImmutableStudent student =
                new ImmutableStudent(1, "Richa");

        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}