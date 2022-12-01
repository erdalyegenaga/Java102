public class Lecturer extends AcademicPersonal {
    private String doorNo;

    public Lecturer(String nameSurname, String phone, String email, String department, String degree, String doorNo) {
        super(nameSurname, phone, email, department, degree);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public void meetingSenate() {
        System.out.println(this.doorNo + " door number of " + this.getNameSurname() + " was at meeting. ");
    }

    public void makeExam() {
        System.out.println(this.getNameSurname() + " " + this.getDegree() + " made an exam ");
    }
}

