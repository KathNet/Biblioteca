import java.util.Scanner;

public class Menu {

    public String CreateMenu() {
        String Menu = new String();
        Menu = "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut Book\n" +
                "3)Return Book \n" +
                "4)List of Movies \n"+
                "0)Exit\n"+
                "Option: ";
        return Menu;
    }

    public String PrintWelcomeMessage(){
        String Massage= "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return Massage;
    }

    public String PrintErrorChoiceMessage(){
        String massage= "Please select a valid option!";
        return massage;
    }


    public void RecibeOptionChooseForUserAndCallTheActionSelect(String option) {
        Scanner scanner = new Scanner(System.in);
        boolean verification= false;
        switch (option){
            case "0":
                System.out.println("Quit Application");
                break;
            case "1":
                System.out.println("List of Books:  \n");
                PrintCollectionBooks();
                break;
            case "2":
                System.out.println("Checkout Book \n");
                System.out.println("List of Books:  \n");
                PrintCollectionBooks();
                System.out.println("----------------------------------------------");
                System.out.println("Name of Book: \n");
                String nameBook= scanner.nextLine();
                verification = BookingService.RemoveBookToTheSystem(nameBook);
                PrintMessageAboutCheckout(verification);
                PrintCollectionBooks();
                break;
            case "3":
                System.out.println("Return Book \n");
                System.out.println("List of Books:  \n");
                PrintCollectionBooks();
                System.out.println("----------------------------------------------");
                System.out.println("Name of Book: \n");
                String nameOfBook= scanner.nextLine();
                System.out.println("Date: \n");
                String date= scanner.nextLine();
                System.out.println("Author: \n");
                String author= scanner.nextLine();
                Book book = new Book(nameOfBook, date,author);
                verification = BookingService.AddBookToTheSystem(book);
                PrintMessageAboutAddBook(verification);
                PrintCollectionBooks();
                break;
            case "4":
                System.out.println("List of Movies \n");
                PrintCollectionMovies();
                break;
            default:
                System.out.println(this.PrintErrorChoiceMessage());
                break;
        }
    }

    public void PrintCollectionBooks(){
        for (Book item:BookingService.getCollectionBooks()) {
            System.out.println(item.getNameOfBook()+ " "+item.getYearOfPublished() +" "+ item.getAuthor());
        }
    }

    public void PrintCollectionMovies(){
        for (Movie movie: MovieService.getMovieList()) {
            System.out.println(movie.getNameMovie()+" "+movie.getYear()+" "+movie.getDirector()+" "+movie.getRanting());
        }
    }

    public boolean PrintMessageAboutCheckout(boolean verification){
            if(verification){
                System.out.println("Thank you! Enjoy the book");
                return true;
            }
            else {
                System.out.println("Sorry, that book is not available");
                return false;
            }
    }

    public boolean PrintMessageAboutAddBook(boolean verification){
        if(verification){
            System.out.println("Thank you for returning the book");
            return true;
        }
        else {
            System.out.println("That is not a valid book to return");
            return false;
        }
    }


}
