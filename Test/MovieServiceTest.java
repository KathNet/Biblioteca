import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void ChargeInitialListOfBook(){
        //Arrange
        //Act
        MovieService.ChargeDefaultMovieList();
        //Assert
        assertEquals(5, MovieService.getMovieList().size());
    }


}