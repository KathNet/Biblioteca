package serviceTest;

import domain.Book;
import org.junit.jupiter.api.Test;
import service.BookingService;

import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    @Test
    void checkTheProcedureOfChargeBookInListOfBook(){
        //Act
        BookingService.loadInitialBooks();
        //Assert
        assertEquals(5, BookingService.getCollectionBooks().size());
    }

    @Test
    void checkAddBookInTheSystem(){
        //Arrange
        Book book= new Book("Chronic Soul","2023","Katherine Pino");
        BookingService.getCollectionBooks().clear();
        //Act
        BookingService.addBookToTheSystem(book);
        //Assert
        assertEquals(1, BookingService.getCollectionBooks().size());
    }

    @Test
    void checkRemoveBookInTheSystem(){
        //Arrange
        Book book= new Book("Chronic Blood","2020","Katherine Pino");
        BookingService.loadInitialBooks();
        //Act
        BookingService.removeBookToTheSystem("Chronic Blood");
        //Assert
        assertEquals(4, BookingService.getCollectionBooks().size());
    }
}