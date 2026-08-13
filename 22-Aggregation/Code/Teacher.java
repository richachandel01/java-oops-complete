public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void display() {

        System.out.println(
                "Teacher: " + name
        );
    }
}