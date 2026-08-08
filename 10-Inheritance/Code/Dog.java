public class Dog extends Animal {

    void bark() {

        System.out.println("Dog barks");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}