public class Department {

    private Teacher teacher;

    public Department(Teacher teacher) {

        this.teacher = teacher;
    }

    public void display() {

        System.out.println(
                "Department has:"
        );

        teacher.display();
    }
}