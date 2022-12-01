public class AcademicPersonal extends Personal {
    private String department;
    private String degree;

    public AcademicPersonal(String nameSurname, String phone, String email, String department, String degree) {
        super(nameSurname, phone, email);
        this.department = department;
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void entryLesson(){
        System.out.println(this.getNameSurname() + " derse giris yapti.");
    }
}
