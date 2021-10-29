package BeforeSolid;

abstract class Doctor implements DoctorActions{
    public void performOperations(){
        System.out.println("perform operation");
    }
}
