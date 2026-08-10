package app;

import college.Student;
import college.College;

public class MainApp {

    public static void main(String[] args) {

        Student student = new Student("Richa");

        student.display();

        College college = new College();

        college.display();
    }
}