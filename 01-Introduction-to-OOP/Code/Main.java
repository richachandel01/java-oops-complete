public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Richa";
        s1.rollNo = 101;
        s1.branch = "CSE";

        s1.study();
        s1.eat();

        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Fortuner";

        car.start();
        car.accelerate();
        car.stop();
    }
}