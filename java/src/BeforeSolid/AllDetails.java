package BeforeSolid;

//Violates Single Responsibility Principle
public class AllDetails {
    public void getPatientDetails(String name, String disease){
        System.out.println("The Patient Name: "+name+" has"+disease+" disease");
    }

    public void getHospitalDetails(){
        System.out.println("The name of the hospital is Virinchi");
    }
}
