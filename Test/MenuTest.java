import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MenuTest {

    @BeforeEach
    void setUp(){

    }

    @Test
    void shouldPrintHelloOnScreen() {
        //Arrange
        String TextTest;
        Menu menu= new Menu();

        //Act
        TextTest= menu.PrintWelcomeMessage();

        //Assert
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", TextTest);
    }

    @Test
    void ReturnMenuInFormatString(){
        //Arrange
        Menu menu = new Menu();
        String MenuReal= new String();
        String MenuTest= "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut Book\n" +
                "3)Return Book \n" +
                "0)Exit\n"+
                "Option: ";

        //Act
        MenuReal= menu.CreateMenu();

        //Assert
        assertTrue(MenuReal.equals(MenuTest));
    }

    @Test
    void CheckValidOptionOneMessage(){
        //Arrange
        Menu menu = new Menu();
        String Result = new String();
        //Act
        Result= menu.RecibeOptionChooseForUserAndCallTheActionSelect("1");

        //Assert
        assertEquals("", Result);
    }

    @Test
    void CheckInvalidOptionMessage(){
        //Arrange
        Menu menu = new Menu();
        String Result = new String();

        //Act
        Result= menu.RecibeOptionChooseForUserAndCallTheActionSelect("x");

        //Assert
        assertEquals("Please select a valid option!", Result);
    }


    @Test
    public void systemExitWithArbitraryStatusCode() {
        //Arrange
        Menu menu = new Menu();
        String Result = new String();

        //Act
        Result= menu.RecibeOptionChooseForUserAndCallTheActionSelect("0");

        //Assert
        assertEquals("Quit Application", Result);
    }

    @Test
    void CheckSuccessMessageOnCheckoutOfABook(){
        //Arrange
        Menu menu= new Menu();
        boolean verification= false;
        // Act
        verification=menu.PrintMessageAboutCheckout(true);

        // Assert
        assertEquals(true, verification);
    }

    @Test
    void CheckUnsuccessfulMessage(){
        //Arrange
        Menu menu= new Menu();
        boolean verification= true;
        // Act
        verification=menu.PrintMessageAboutCheckout(false);

        // Assert
        assertEquals(false, verification);
    }

    @Test
    void CheckNotifiedOnSuccessfulReturn(){
        //Arrange
        Book book = new Book("libro1", "1999", "juan");
        Menu menu = new Menu();
        boolean verification= false;
        //Act
        verification = menu.PrintMessageNotifiedOnSuccessfulReturn(book);

        //Assert
        assertEquals(true, verification);

    }
}