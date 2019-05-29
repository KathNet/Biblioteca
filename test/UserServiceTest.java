import org.junit.jupiter.api.Test;
import service.UserService;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void checkDefaultUser(){
        //Arrange
        //Act
        UserService.defaultUserCharge();
        //Assert
        assertEquals(1, UserService.getUsers().size());
    }

    @Test
    void checkVerificationOfUserAndPassword()
    {
        //Arrange
        UserService.defaultUserCharge();
        //Act
        //Assert
        assertEquals(true, UserService.verificationOfUserAdminAndPass("xxx-xxxx", "xxx"));
    }

    @Test
    void checkFailVerificationOfUserAndPassword()
    {
        //Arrange
        UserService.defaultUserCharge();
        //Act
        //Assert
        assertEquals(false, UserService.verificationOfUserAdminAndPass("xxxxxxx", "xxx"));
    }

    @Test
    void checkCorrectSearchInListOfUser(){
        //Arrange
        //Act
        UserService.defaultUserCharge();
        // Assert
        assertEquals(true, UserService.searchInListOfUserForOneUser("xxx-xxxx","xxx"));
    }
}