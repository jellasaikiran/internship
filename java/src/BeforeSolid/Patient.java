package BeforeSolid;

public interface Patient {
    public String getDescription();
    public int getBill(); //Violating Interface Segregation
    public void setDiseaseName(String diseaseName);
    public String getDiseaseName();
}
