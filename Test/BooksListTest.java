import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<Book> BookOfList= new ArrayList<Book>();
        Book book1= new Book("El Quijote", "JKuanito", "1990");
        Book book2= new Book("El Quijote2", "JKuanito", "1990");

        //Act
        booksList.AddBookToTheSystem(book1);
        booksList.AddBookToTheSystem(book2);
        BookOfList = booksList.ReturnAListOfBooksInSystem();

        //Assert
        assertEquals(BookOfList.size(), 2);
    }
}

