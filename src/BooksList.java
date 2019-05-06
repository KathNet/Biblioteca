import java.util.ArrayList;
import java.util.List;

public class BooksList {

    List<Book> BookList = new ArrayList<Book>();

    public void BookList(){}

    public List<Book> ReturnAListOfBooksInSystem(){
        return BookList;
    }

    public void AddBookToTheSystem(Book book){
        BookList.add(book);
    }


}
