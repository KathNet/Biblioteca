import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void CheckDefaultUser(){
        //Arrange
        //Act
        UserService.DefaultUserCharge();
        //Assert
        assertEquals(1, UserService.getUsers().size());
    }

    @Test
    void CheckVerificationOfUserAndPassword()
    {
        //Arrange
        UserService.DefaultUserCharge();
        //Act
        //Assert
        assertEquals(true, UserService.VerificationOfUserAdminAndPass("xxx-xxxx", "xxx"));
    }

    @Test
    void CheckFailVerificationOfUserAndPassword()
    {
        //Arrange
        UserService.DefaultUserCharge();
        //Act
        //Assert
        assertEquals(false, UserService.VerificationOfUserAdminAndPass("xxxxxxx", "xxx"));
    }

    @Test
    void CheckCorrectSeachInListOfUser(){
        //Arrange
        //Act
        UserService.DefaultUserCharge();
        // Assert
        assertEquals(true, UserService.SearchInListOfUserForOneUser("xxx-xxxx","xxx"));
    }
}