package BeforeSolid;

public class GeneralPhysician extends Doctor {

    public void performOperations() {
        throw new UnsupportedOperationException(); //Physician cannot perform operations
    }

    public void checkPatients() {
        System.out.println("Checking Patients");
    }
}
