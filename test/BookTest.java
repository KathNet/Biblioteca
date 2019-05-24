import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @BeforeEach
    void setUp(){
    }

    // __SHOULD__RETURN_____WHEN/GIVEN_______
    // __RETURNS/HANDLES/MANAGES______WHEN/GIVEN_______
    @Test
    void shouldReturnNewStateWhenBookChangesState() {

        //Arrange
        Book book = new Book("GOT", "Pancho", "1990");
        boolean bookState;

        //Act
        bookState = book.changeStateOfBook(false);

        //Assert
        assertEquals(false, bookState);
    }

}