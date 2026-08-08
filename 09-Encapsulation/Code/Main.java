public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Richa");
        student.setAge(22);

        System.out.println(student.getName());
        System.out.println(student.getAge());

        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(1000);

        System.out.println(account.getBalance());
    }
}