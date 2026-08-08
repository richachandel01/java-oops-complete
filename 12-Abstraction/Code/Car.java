public class Car extends Vehicle {

    @Override
    void start() {

        System.out.println("Car starts with key");
    }

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
        car.stop();
    }
}