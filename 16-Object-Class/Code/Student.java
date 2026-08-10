public class Student {

    private int id;
    private String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Student{id=" + id +
               ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return this.id == other.id &&
               this.name.equals(other.name);
    }

    @Override
    public int hashCode() {

        return 31 * id + name.hashCode();
    }
}