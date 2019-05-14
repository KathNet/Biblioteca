import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    @Test
    void CheckTheProcedureOfChargeBookInListOfBook(){
        //Act
        BookingService.ChargeInitialBooks();
        //Assert
        assertEquals(5, BookingService.getCollectionBooks().size());
    }

    @Test
    void CheckAddBookInTheSystem(){
        //Arrange
        Book book= new Book("Chronic Soul","2023","Katherine Pino");
        //Act
        BookingService.AddBookToTheSystem(book);
        //Assert
        assertEquals(1, BookingService.getCollectionBooks().size());
    }

    @Test
    void CheckRemoveBookInTheSystem(){
        //Arrange
        Book book= new Book("Chronic Blood","2020","Katherine Pino");
        BookingService.ChargeInitialBooks();
        //Act
        BookingService.RemoveBookToTheSystem("Chronic Blood");
        //Assert
        assertEquals(4, BookingService.getCollectionBooks().size());
    }
}