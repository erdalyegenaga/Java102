public class Assistant extends AcademicPersonal{
    private String officeHour;
    public Assistant(String nameSurname, String phone, String email, String department, String degree, String officeHour){
        super(nameSurname, phone, email, department, degree);
        this.officeHour= officeHour;
    }
    public String getOfficeHour() {
        return officeHour;
    }
    public void setOfficeHour(String officeTime) {
        this.officeHour = officeHour;
    }
    public void makeQuiz() {
        System.out.println(this.getNameSurname() + " made a quiz of " + this.getDegree() + "lecture.");
    }
}
