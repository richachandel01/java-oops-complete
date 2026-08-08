public class ThisObject {

    void display() {

        System.out.println(this);
    }

    public static void main(String[] args) {

        ThisObject obj = new ThisObject();

        obj.display();
    }
}