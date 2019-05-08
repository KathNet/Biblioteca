public class Book {

    private String nameOfBook;
    private String yearOfPublished;
    private String author;
    private boolean isAvailable = true;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(String yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Book(String name, String year, String author) {
        setNameOfBook(name);
        setYearOfPublished(year);
        setAuthor(author);
    }

    public boolean ChangeStateOfBook(boolean StockValue) {
        StockValue = StockValue;
        return StockValue;
    }


}
