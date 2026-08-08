public class RuntimePolymorphism {

    public static void main(String[] args) {

        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}