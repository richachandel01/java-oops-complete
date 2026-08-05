public class ArrayOfObjects {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "Aman";
        students[0].age = 20;

        students[1].name = "Richa";
        students[1].age = 22;

        students[2].name = "Karan";
        students[2].age = 21;

        for (Student student : students) {

            student.display();

        }

    }

}