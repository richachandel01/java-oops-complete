public class Dog implements Animal {

    @Override
    public void sound() {

        System.out.println("Dog barks");
    }

    @Override
    public void eat() {

        System.out.println("Dog eats");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();
    }
}