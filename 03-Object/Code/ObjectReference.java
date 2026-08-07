public class ObjectReference {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Richa";
        s1.age = 22;

        Student s2 = s1;

        s2.name = "Priya";

        s1.display();
        s2.display();

    }

}