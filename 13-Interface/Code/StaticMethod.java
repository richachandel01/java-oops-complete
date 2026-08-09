interface VehicleInterface {

    default void start() {

        System.out.println("Default vehicle start");
    }
}

public class DefaultMethod
        implements VehicleInterface {

    @Override
    public void start() {

        System.out.println("Car starts");
    }

    public static void main(String[] args) {

        DefaultMethod car = new DefaultMethod();

        car.start();
    }
}