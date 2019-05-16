import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieServiceTest {

    @Test
    void ChargeInitialListOfBook(){
        //Arrange
        //Act
        MovieService.ChargeDefaultMovieList();
        //Assert
        assertEquals(5, MovieService.getMovieList().size());
    }

    @Test
    void CheckoutMovieSuccess(){
        //Arrange
        MovieService.ChargeDefaultMovieList();
        //Act
        //Assert
        assertEquals(true, MovieService.RemoveMovieToTheSystem("Superman"));
    }

    @Test
    void CheckoutMovieFail(){
        //Arrange
        MovieService.ChargeDefaultMovieList();
        //Act
        //Assert
        assertEquals(false, MovieService.RemoveMovieToTheSystem("Superman2"));
    }
}