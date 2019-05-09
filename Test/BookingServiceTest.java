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
        Book book= new Book("","","");
        //Act
        BookingService.AddBookToTheSystem(book);
        //Assert
        assertEquals(1, BookingService.getCollectionBooks().size());
    }
}