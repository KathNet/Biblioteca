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
        Menu menu = new Menu();
        String MenuReal= new String();
        String MenuTest = "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut Book\n" +
                "3)Return Book \n" +
                "4)List of Movies \n"+
                "5)CheckOut Movie: \n"+
                "6)login \n" +
                "0)Exit\n"+
                "Option: ";
        MenuReal= menu.createMenu();
        assertTrue(MenuReal.equals(MenuTest));
    }

    @Test
    void checkSuccessMessageOnCheckoutOfABook(){
        Menu menu= new Menu();
        boolean verification= false;
        verification=menu.printMessageAboutCheckout(true);
        assertEquals(true, verification);
    }

    @Test
    void checkUnsuccessfulMessageChekoutOfBook(){
        Menu menu= new Menu();
        boolean verification= true;
        verification=menu.printMessageAboutCheckout(false);
        assertEquals(false, verification);
    }

    @Test
    void checkSuccessReturnOnCheckoutOfABook(){
        Menu menu= new Menu();
        boolean verification= false;
        verification=menu.printMessageAboutAddBook(true);
        assertEquals(true, verification);
    }

    @Test
    void checkUnsuccessfulReturnMessageBook(){
        Menu menu= new Menu();
        boolean verification= true;
        verification=menu.printMessageAboutAddBook(false);
        assertEquals(false, verification);
    }
}