import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingServiceTest {

    @Test
    void CheckTheProcedureOfChargeBookInListOfBook(){
        //Arrage

        //Act
        BookingService.ChargeInitialBooks();

        //Assert
        assertEquals(5, BookingService.collectionBooks.size());
    }

}