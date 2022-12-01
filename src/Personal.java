public class Personal {
    private String nameSurname;
    private String phone;
    private String email;

    public Personal(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void entry(){
        System.out.println(this.nameSurname + " universiteye giris yapti.");
    }
    public void exit(){
        System.out.println(this.nameSurname + " universiteden cikis yapti.");
    }
    public void lunch(){
        System.out.println(this.nameSurname + " yemekhaneye girdi.");
    }
}
