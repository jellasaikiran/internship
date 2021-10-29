package AfterSolid;

public class CancerPatient implements Patient{
    private String diseaseName;

    @Override
    public int getBill() {
        return 50000;
    }

    @Override
    public String getDiseaseName() {
        return diseaseName;
    }

    @Override
    public String getDescription() {
        return "Suffering from Blood Cancer";
    }

    @Override
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
}
