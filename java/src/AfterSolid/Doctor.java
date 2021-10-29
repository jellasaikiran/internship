package AfterSolid;

public class Doctor implements CheckPatients,PerformOperations{
    public void checkPatient() {
        System.out.println("Checking Patients");
    }

    public void performOperations() {
        System.out.println("Performing Operations");
    }
}
