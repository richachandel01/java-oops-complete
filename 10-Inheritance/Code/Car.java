public class Car extends Vehicle {

    void display() {

        System.out.println(brand);
    }

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.display();
    }
}