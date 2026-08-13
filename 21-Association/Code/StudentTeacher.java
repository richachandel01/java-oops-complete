public class StudentTeacher {

    public static void main(String[] args) {

        Student student =
                new Student("Richa");

        Teacher teacher =
                new Teacher("Anita");

        teacher.teach(student);
    }
}