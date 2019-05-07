import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldPrintHelloOnScreen() {
        //Arrange
        String TextTest;

        //Act
        TextTest= Main.PrintWelcomeMessage();

        //Assert
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", TextTest);
        }

}