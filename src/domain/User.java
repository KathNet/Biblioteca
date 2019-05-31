package domain;

public class User {

    private String credential;
    private String passwordUser;
    private String name= "";
    private String email= "";
    private String phone="";
    private boolean state=false;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getCredential() {
        return credential;
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


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(String credential, String pass, String name, String mail, String phone, boolean state){
        setNameOfUser(credential);
        setPasswordUser(pass);
        setName(name);
        setEmail(mail);
        setPhone(phone);
        setState(state);
    }

}
