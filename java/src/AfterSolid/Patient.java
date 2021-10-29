package AfterSolid;

public interface Patient extends Bill, DiseaseName {
    public String getDescription();
    //    Open Segregation Principle
}
