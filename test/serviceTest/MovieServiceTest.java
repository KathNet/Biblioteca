package serviceTest;

import org.junit.jupiter.api.Test;
import service.MovieService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieServiceTest {

    @Test
    void chargeInitialListOfBook(){
        MovieService.loadDefaultMovieList();
        assertEquals(5, MovieService.getMovieList().size());
    }

    @Test
    void checkoutMovieSuccess(){
        MovieService.loadDefaultMovieList();
        assertEquals(true, MovieService.removeMovieToTheSystem("Superman"));
    }

    @Test
    void checkoutMovieFail(){
        MovieService.loadDefaultMovieList();
        assertEquals(false, MovieService.removeMovieToTheSystem("Superman2"));
    }
}