public class College {

    private Student student;

    public College(Student student) {

        this.student = student;
    }

    public void display() {

        student.display();
    }
}