import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private static List<Movie> movieList= new ArrayList<Movie>();

    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static void chargeDefaultMovieList(){
        getMovieList().clear();
        Movie movie1= new Movie("Superman","1978","Richard Donner","10");
        Movie movie2= new Movie("Pokémon the Movie: The Power of Us","2018","Tetsuo Yajima","5");
        Movie movie3= new Movie("Predestination","2014"," Michael Spierig","10");
        Movie movie4= new Movie("Star Wars","1977","George Lucas","10");
        Movie movie5= new Movie("Batman,","1989","Tim Burton","8");

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
    }

    public static boolean removeMovieToTheSystem(String nameOfMovie) {
        int index = 0;
        for (Movie movie : getMovieList()) {
            if (movie.getNameMovie().equals(nameOfMovie)) {
                getMovieList().remove(index);
                return true;
            }
            index++;
        }
        return false;
    }

}
