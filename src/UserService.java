import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static List<User> users= new ArrayList<User>();

    public static List<User> getUsers() {
        return users;
    }

    public static void defaultUserCharge(){
        getUsers().clear();
        User user= new User("xxx-xxxx", "xxx", "admin","admin@gmail.com","555-5555");
        getUsers().add(user);
    }

    public static boolean verificationOfUserAdminAndPass(String credential, String pass)
    {
       if(getUsers().get(0).getCredential().equals(credential) && getUsers().get(0).getPasswordUser().equals(pass)){
           return true;
       }
       return false;
    }

    public static boolean searchInListOfUserForOneUser(String credential, String pass){
        int index=0;
        for (User user: getUsers()) {
            if(getUsers().get(index).getCredential().equals(credential) && getUsers().get(index).getPasswordUser().equals(pass)){
                return true;
            }
        }
        return false;
    }
}

