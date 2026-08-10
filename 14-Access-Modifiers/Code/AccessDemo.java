public class AccessDemo {

    public int publicValue = 10;

    protected int protectedValue = 20;

    int defaultValue = 30;

    private int privateValue = 40;

    public void display() {

        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);
    }
}