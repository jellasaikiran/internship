package AfterSolid;

public class Main {
    public static void main(String[] args) {

        //Liskov Principle Implementation
        CheckPatients doctor=new Doctor();
        doctor.checkPatient();

        CheckPatients physician=new GeneralPhysician();
        physician.checkPatient();


        PatientDescription patientDescription=new PatientDescription();  // Dependency principle
        patientDescription.create(new CancerPatient());
        System.out.println(patientDescription.getDescription());
        patientDescription.create(new CovidPatient());
        System.out.println(patientDescription.getDescription());
    }
}
