package service;

import domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static List<User> users= new ArrayList<User>();

    public static List<User> getUsers() {
        return users;
    }

    public static void loadDefaultUsers(){
        getUsers().clear();
        User user= new User("xxx-xxxx", "xxx", "admin","admin@gmail.com","555-5555" , false);
        getUsers().add(user);
        User user2= new User("kath", "123", "Katherine", "kath@gmail.com", "123-4567", false);
        getUsers().add(user2);
    }

    public static boolean verificationOfUserAdminAndPass(String credential, String pass)
    {
       if(getUsers().get(0).getCredential().equals(credential) && getUsers().get(0).getPasswordUser().equals(pass)){
           getUsers().get(0).setState(true);
           return true;
       }
       return false;
    }

    public static boolean searchUserAndChangeState(String user, String pass)
    {
        int count=0;
        boolean existUser= false;
        for (User unknownUser: getUsers()) {
            if(unknownUser.getCredential().equals(user) && unknownUser.getPasswordUser().equals(pass));
            {
                getUsers().get(count).setState(true);
                existUser= true;
            }
            count++;
        }
        return existUser;
    }

    public static boolean searchInListOfUserForOneUser(String credential, String pass){
        int index=0;
        for (User user: getUsers()) {
            if(getUsers().get(index).getCredential().equals(credential) && getUsers().get(index).getPasswordUser().equals(pass)){
                return true;
            }
            index++;
        }
        return false;
    }


}

