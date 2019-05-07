public class Book {

    String NameOfBook;
    String YearOfPublished;
    String Author;
    boolean State = true;

    public Book(String name, String Year, String Author) {
        NameOfBook = name;
        YearOfPublished = Year;
        Author = Author;
    }

    public boolean ChangeStateOfBook(boolean StockValue) {
        StockValue = StockValue;
        return StockValue;
    }
}
