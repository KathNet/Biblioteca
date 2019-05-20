public class User {

    private String credential;
    private String passwordUser;
    private String name= "";
    private String email= "";
    private String phone="";

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getPasswordUser() {
        return passwordUser;
    }


    public void setPasswordUser(String passwordUser) {

        this.passwordUser = passwordUser;
    }


    public void setNameOfUser(String credential) {
        this.credential = credential;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(String credential, String pass, String name, String mail, String phone){
        setNameOfUser(credential);
        setPasswordUser(pass);
        setName(name);
        setEmail(mail);
        setPhone(phone);
    }

}
