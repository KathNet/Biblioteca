import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    @BeforeEach
    void setUp(){
    }

    @Test
    void ChangeStateOfBook() {

        //Arrange
        Book book = new Book("GOT", "Pancho", "1990");
        boolean verification= true;

        //Act
        verification= book.ChangeStateOfBook(false);

        //Assert
        assertEquals(false, verification);
    }

}