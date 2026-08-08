public class Circle extends Shape {

    private double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    double area() {

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        circle.display();

        System.out.println("Area: " + circle.area());
    }
}