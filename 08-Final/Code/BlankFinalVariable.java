public class BlankFinalVariable {

    final int number;

    BlankFinalVariable(int number) {

        this.number = number;
    }

    public static void main(String[] args) {

        BlankFinalVariable obj =
                new BlankFinalVariable(50);

        System.out.println(obj.number);
    }
}