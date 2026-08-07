public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Richa";
        s1.age = 22;
        s1.branch = "CSE";

        Student s2 = new Student();

        s2.name = "Rahul";
        s2.age = 21;
        s2.branch = "IT";

        s1.display();
        s2.display();

        Car car = new Car();

        car.brand = "BMW";
        car.color = "Black";
        car.speed = 220;

        car.start();

    }
}