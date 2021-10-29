package BeforeSolid;

public class Main {
    public static void main(String[] args) {

        Doctor doctor=new GeneralPhysician();
        doctor.performOperations();   //liskov principle violation
        doctor.checkPatients();

        PatientDescription patientDescription=new PatientDescription();        // Dependency principle violation
        patientDescription.create(new CancerPatient());
        System.out.println(patientDescription.getDescription());

    }
}
