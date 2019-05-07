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

    @Test
    void ChangeStateOfBookInTheLibrary(){
        //Arrange
        BooksList bookList = new BooksList();
        Book book1= new Book("libro1", "1909", "Juan");
        Book book2= new Book("libro2", "1909", "Juan");
        bookList.AddBookToTheSystem(book1);
        bookList.AddBookToTheSystem(book2);
        boolean verification = false;

        //Act
        verification= bookList.CheckOutBook("libro1");

        //Assert
        assertEquals(true,verification);
    }

    @Test
    void ChangeSizeBookList(){

        //Arrange
        BooksList bookList = new BooksList();
        Book book1= new Book("libro1", "1909", "Juan");
        Book book2= new Book("libro2", "1909", "Juan");
        bookList.AddBookToTheSystem(book1);
        bookList.AddBookToTheSystem(book2);


        //Act
        bookList.CheckOutBook("libro1");

        //Assert
        assertEquals(1, bookList.getBookList().size());
    }

    @Test
    void CheckRemoveBook(){

        //Arrange
        BooksList bookList = new BooksList();
        Book book1= new Book("libro1", "1909", "Juan");
        Book book2= new Book("libro2", "1909", "Juan");
        bookList.AddBookToTheSystem(book1);
        bookList.AddBookToTheSystem(book2);


        //Act
        bookList.CheckOutBook("libro1");

        //Assert
        assertEquals("libro2", bookList.getBookList().get(0).NameOfBook);
    }

    @Test
    void CheckReturnABook() {
        //Arrange
        BooksList bookList = new BooksList();
        Book book1= new Book("libro1", "1909", "Juan");

        //Act
        bookList.ReturnAbook(book1);

        //Assert
        assertEquals(0, bookList.getBookList().size());
    }

}

