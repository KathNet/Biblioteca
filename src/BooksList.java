import java.util.ArrayList;
import java.util.List;

public class BooksList {

    List<String> ListOfBooksInTheSystem = new ArrayList<String>();

    public void BookList(){}

    public List ReturnAListofBooksInTheSystem(){
        return  ListOfBooksInTheSystem;
    }

    public void AddBookToTheSystem(String book){
        ListOfBooksInTheSystem.add(book);
    }
}
