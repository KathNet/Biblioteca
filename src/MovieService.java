import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private static List<Movie> MovieList= new ArrayList<Movie>();

    public static List<Movie> getMovieList() {
        return MovieList;
    }

    public static void setMovieList(List<Movie> movieList) {
        MovieList = movieList;
    }


}
