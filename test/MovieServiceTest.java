import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieServiceTest {

    @Test
    void chargeInitialListOfBook(){
        //Arrange
        //Act
        MovieService.chargeDefaultMovieList();
        //Assert
        assertEquals(5, MovieService.getMovieList().size());
    }

    @Test
    void checkoutMovieSuccess(){
        //Arrange
        MovieService.chargeDefaultMovieList();
        //Act
        //Assert
        assertEquals(true, MovieService.removeMovieToTheSystem("Superman"));
    }

    @Test
    void checkoutMovieFail(){
        //Arrange
        MovieService.chargeDefaultMovieList();
        //Act
        //Assert
        assertEquals(false, MovieService.removeMovieToTheSystem("Superman2"));
    }
}