import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BooksListTest {

    @BeforeEach
    void setUp(){
    }

    @Test
    void ShowAListOfBooksAfterWelcomeMessage()
    {
        //Arrange
        BooksList booksList= new BooksList();
        List<String> ListOfBook;

        //Act
        booksList.AddBookToTheSystem("El Quijote");
        booksList.AddBookToTheSystem("El mio Cid");
        ListOfBook = booksList.ReturnAListofBooksInTheSystem();

        //Assert
        assertEquals(ListOfBook.size(), 2);
    }
}

