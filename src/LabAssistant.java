public class LabAssistant extends Assistant{
    public LabAssistant(String nameSurname, String phone, String email, String department, String degree, String officeHour){
        super(nameSurname, phone, email, department, degree, officeHour);
    }
    public void enterLab(){
        System.out.println(this.getNameSurname() + " has entered to lab " + this.getDegree());
    }
    public void enterLecture(){
        System.out.println(this.getNameSurname()+ " has entered to lecture " + this.getDegree());
    }
}
