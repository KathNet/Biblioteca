package serviceTest;

import domain.Book;
import org.junit.jupiter.api.Test;
import service.BookingService;

import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    @Test
    void checkTheProcedureOfChargeBookInListOfBook(){
        BookingService.loadInitialBooks();
        assertEquals(5, BookingService.getCollectionBooks().size());
    }

    @Test
    void checkAddBookInTheSystem(){
        Book book= new Book("Chronic Soul","2023","Katherine Pino");
        BookingService.getCollectionBooks().clear();
        BookingService.addBookToTheSystem(book);
        assertEquals(1, BookingService.getCollectionBooks().size());
    }

    @Test
    void checkRemoveBookInTheSystem(){
        Book book= new Book("Chronic Blood","2020","Katherine Pino");
        BookingService.loadInitialBooks();
        BookingService.removeBookToTheSystem("Chronic Blood");
        assertEquals(4, BookingService.getCollectionBooks().size());
    }
}