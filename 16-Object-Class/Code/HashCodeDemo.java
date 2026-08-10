public class HashCodeDemo {

    public static void main(String[] args) {

        Student s1 =
                new Student(1, "Richa");

        Student s2 =
                new Student(1, "Richa");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}