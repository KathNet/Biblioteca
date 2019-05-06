import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void shouldPrintHelloOnScreen() {
        //Arrange
        final ByteArrayOutputStream outContent= new ByteArrayOutputStream();
        final PrintStream originalOut= System.out;
        System.setOut(new PrintStream(outContent));

        //Act
        Main main = new Main();
        main.main(new String[0]);

        //Assert
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", outContent.toString());
        System.setOut(originalOut);
    }

    }