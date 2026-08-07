public class PassByValue {

    static void changeValue(int number) {

        number = 100;

        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int number = 10;

        changeValue(number);

        System.out.println("Outside method: " + number);
    }
}