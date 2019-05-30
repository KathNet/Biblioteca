package serviceTest;

import org.junit.jupiter.api.Test;
import service.MovieService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieServiceTest {

    @Test
    void chargeInitialListOfBook(){
        //Arrange
        //Act
        MovieService.loadDefaultMovieList();
        //Assert
        assertEquals(5, MovieService.getMovieList().size());
    }

    @Test
    void checkoutMovieSuccess(){
        //Arrange
        MovieService.loadDefaultMovieList();
        //Act
        //Assert
        assertEquals(true, MovieService.removeMovieToTheSystem("Superman"));
    }

    @Test
    void checkoutMovieFail(){
        //Arrange
        MovieService.loadDefaultMovieList();
        //Act
        //Assert
        assertEquals(false, MovieService.removeMovieToTheSystem("Superman2"));
    }
}