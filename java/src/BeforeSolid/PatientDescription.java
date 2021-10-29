package BeforeSolid;

public class PatientDescription {
    CancerPatient patient1;

    public void create(CancerPatient p){
        patient1=p;
    }
    public String getDescription(){
        return patient1.getDescription();
    }
}
