import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @BeforeEach
    void setUp(){

    }

    @Test
    void ReturnMenuInFormatString(){
        //Arrange
        Menu menu = new Menu();
        String MenuReal= new String();
        String MenuTest= "Chose Option: \n 1)List of Books \n Option: ";

        //Act
        MenuReal= menu.CreateMenu();

        //Assert
        assertTrue(MenuReal.equals(MenuTest));
    }

}