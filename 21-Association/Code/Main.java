public class DoctorPatient {

    public static void main(String[] args) {

        Doctor doctor =
                new Doctor("Dr. Sharma");

        Patient patient =
                new Patient("Richa");

        doctor.treat(patient);
    }
}