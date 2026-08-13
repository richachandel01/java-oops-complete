public class Doctor {

    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat(Patient patient) {

        System.out.println(
                name + " treats " +
                patient.getName()
        );
    }
}