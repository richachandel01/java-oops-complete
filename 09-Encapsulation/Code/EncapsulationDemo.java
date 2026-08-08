public class EncapsulationDemo {

    private String password;

    public void setPassword(String password) {

        if (password != null && password.length() >= 8) {

            this.password = password;
        }
    }

    public boolean verifyPassword(String password) {

        return this.password != null &&
               this.password.equals(password);
    }

    public static void main(String[] args) {

        EncapsulationDemo obj =
                new EncapsulationDemo();

        obj.setPassword("Java@123");

        System.out.println(
                obj.verifyPassword("Java@123")
        );
    }
}