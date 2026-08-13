public class AggregationDemo {

    public static void main(String[] args) {

        Teacher teacher =
                new Teacher("Anita");

        Department department =
                new Department(teacher);

        department.display();

        // Teacher can still exist
        // independently of Department.

        teacher.display();
    }
}