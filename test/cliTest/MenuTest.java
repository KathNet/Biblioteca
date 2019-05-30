package cliTest;

import cli.Menu;
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
        TextTest= menu.printWelcomeMessage();

        //Assert
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", TextTest);
    }

    @Test
    void shouldPrintPleaseSelectAInvalidOptionMessage() {
        //Arrange
        Menu menu = new Menu();
        String validation="";

        //Act
        validation= menu.printErrorChoiceMessage();

        //Assert
        assertEquals("Please select a valid option!", validation);
    }


    @Test
    void returnMenuInFormatString(){
        //Arrange
        Menu menu = new Menu();
        String MenuReal= new String();
        String MenuTest = "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut domain.Book\n" +
                "3)Return domain.Book \n" +
                "4)List of Movies \n"+
                "5)CheckOut domain.Movie: \n"+
                "0)Exit\n"+
                "Option: ";

        //Act
        MenuReal= menu.createMenu();

        //Assert
        assertTrue(MenuReal.equals(MenuTest));
    }

    @Test
    void checkSuccessMessageOnCheckoutOfABook(){
        //Arrange
        Menu menu= new Menu();
        boolean verification= false;
        // Act
        verification=menu.printMessageAboutCheckout(true);

        // Assert
        assertEquals(true, verification);
    }

    @Test
    void checkUnsuccessfulMessageChekoutOfBook(){
        //Arrange
        Menu menu= new Menu();
        boolean verification= true;
        // Act
        verification=menu.printMessageAboutCheckout(false);

        // Assert
        assertEquals(false, verification);
    }

    @Test
    void checkSuccessReturnOnCheckoutOfABook(){
        //Arrange
        Menu menu= new Menu();
        boolean verification= false;
        // Act
        verification=menu.printMessageAboutAddBook(true);

        // Assert
        assertEquals(true, verification);
    }

    @Test
    void checkUnsuccessfulReturnMessageBook(){
        //Arrange
        Menu menu= new Menu();
        boolean verification= true;
        // Act
        verification=menu.printMessageAboutAddBook(false);

        // Assert
        assertEquals(false, verification);
    }


}