import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print(PrintWelcomeMessage());

        BooksList booksList= new BooksList();
        PrintListOfBooksInScreen(booksList.ReturnAListOfBooksInSystem());
    }

    public static String PrintWelcomeMessage(){
        String Massage= "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return Massage;
    }

    public static void PrintListOfBooksInScreen(List<Book> ListBook){
        ListBook.forEach((book) -> System.out.println(book.NameOfBook + " " + book.Author + " "+ book.YearOfPublished));
    }


}
