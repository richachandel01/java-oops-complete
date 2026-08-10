public class EqualsDemo {

    public static void main(String[] args) {

        Student s1 =
                new Student(1, "Richa");

        Student s2 =
                new Student(1, "Richa");

        System.out.println(s1.equals(s2));
    }
}