public class Main {

    public static void main(String[] args) {

        Student student =
                new Student("Richa");

        College college =
                new College(student);

        college.display();

        student.display();
    }
}