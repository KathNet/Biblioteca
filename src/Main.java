import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print(PrintWelcomeMessage());
        Menu menu= new Menu();
        menu.CreateMenu();
        Scanner key = new Scanner(System.in);
        RecibeOptionChooseForUserAndCallTheActionSelect(key.toString());
    }

    public static String PrintWelcomeMessage(){
        String Massage= "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return Massage;
    }


    public static void RecibeOptionChooseForUserAndCallTheActionSelect(String option){
        if(option.equals("1")) {
            BooksList booksList= new BooksList();
            PrintListOfBooksInScreen(booksList.ReturnAListOfBooksInSystem());
        }
    }

    public static void PrintListOfBooksInScreen(List<Book> ListBook){
        ListBook.forEach((book) -> System.out.println(book.NameOfBook + " " + book.Author + " "+ book.YearOfPublished));
    }


}
