package BeforeSolid;

public class CovidPatient implements Patient {
    private String diseaseName;

    @Override
    public int getBill() {
        return 20000;
    }

    @Override
    public String getDiseaseName() {
        return diseaseName;
    }

    @Override
    public String getDescription() {
        return "Test positive for Covid";
    }

    @Override
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
}
