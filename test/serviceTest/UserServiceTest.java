package serviceTest;

import org.junit.jupiter.api.Test;
import service.UserService;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void checkDefaultUser(){
        UserService.loadDefaultUsers();
        assertEquals(2, UserService.getUsers().size());
    }

    @Test
    void checkVerificationOfUserAndPassword()
    {
        UserService.loadDefaultUsers();
        assertEquals(true, UserService.verificationOfUserAdminAndPass("xxx-xxxx", "xxx"));
    }

    @Test
    void checkFailVerificationOfUserAndPassword()
    {
        UserService.loadDefaultUsers();
        assertEquals(false, UserService.verificationOfUserAdminAndPass("xxxxxxx", "xxx"));
    }

    @Test
    void checkCorrectSearchInListOfUser(){
        UserService.loadDefaultUsers();
        assertEquals(true, UserService.searchInListOfUserForOneUser("xxx-xxxx","xxx"));
    }

    @Test
    void checkSearchUserAndChangeState()
    {
        UserService.loadDefaultUsers();
        UserService.searchUserAndChangeState("Kath", "123");
        assertEquals(true, UserService.getUsers().get(1).isState());

    }
}