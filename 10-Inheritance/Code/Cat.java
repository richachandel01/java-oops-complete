public class Cat extends Animal {

    void meow() {

        System.out.println("Cat meows");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.eat();
        cat.meow();
    }
}