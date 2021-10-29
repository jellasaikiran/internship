package BeforeSolid;

public class Description implements Patient{

    //Violates Open - Closed Principle

    public String getDescription(Patient patient){
        if(patient instanceof CovidPatient){
            return "Covid";
        }
        return "";
    }

    @Override
    public int getBill() {
        return 0;
    }

    @Override
    public String getDiseaseName() {
        return "";
    }

    @Override
    public String getDescription() {
        return "Suffering from Blood Cancer";
    }

    @Override
    public void setDiseaseName(String diseaseName) {}
}
