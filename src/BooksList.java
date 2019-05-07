import java.util.ArrayList;
import java.util.List;

public class BooksList {

    private List<Book> BookList = new ArrayList<>();

    public List<Book> getBookList() {
        return BookList;
    }

    public void setBookList(List<Book> bookList) {
        BookList = bookList;
    }

    public void BookList() {
    }

    public List<Book> ReturnAListOfBooksInSystem() {
        return getBookList();
    }

    public void AddBookToTheSystem(Book book) {
        getBookList().add(book);
    }

    public boolean CheckOutBook(String Name) {
        String book= new String();
        for (int i=0;i<getBookList().size(); i++){
            if(getBookList().get(i).NameOfBook==Name){
                getBookList().get(i).State=false;
                getBookList().remove(i);
                return true;
            }
        }
        return false;
    }
}


