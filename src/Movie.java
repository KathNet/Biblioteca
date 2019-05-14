public class Movie {

    private String nameMovie="";
    private String year="";
    private String director="";
    private String ranting="";

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRanting() {
        return ranting;
    }

    public void setRanting(String ranting) {
        this.ranting = ranting;
    }

    public Movie(String name, String year, String director, String ranking){
        setNameMovie(name);
        setYear(year);
        setDirector(director);
        setRanting(ranking);
    }

    
}
