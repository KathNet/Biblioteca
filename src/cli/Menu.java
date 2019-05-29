package cli;

import domain.Book;
import domain.Movie;

import java.util.Scanner;

public class Menu {

    private

    public String createMenu() {
        String Menu = new String();
        Menu = "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut Book\n" +
                "3)Return Book \n" +
                "4)List of Movies \n"+
                "5)CheckOut domain.Movie: \n"+
                "0)Exit\n"+
                "Option: ";
        return Menu;
    }

    public String printWelcomeMessage(){
        String Massage= "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return Massage;
    }

    public String printErrorChoiceMessage(){
        String massage= "Please select a valid option!";
        return massage;
    }

    public String printQuestionContinue(){
        return "do you want to continue with program?";
    }

    public void receiveOptionChooseForUserAndCallTheActionSelect(String option) {
        Scanner scanner = new Scanner(System.in);
        boolean verification= false;
        String credential;
        String password;
        switch (option){
            case "0":
                System.out.println("Quit Application");
                break;
            case "1":
                System.out.println("List of Books:  \n");
                printCollectionBooks();
                break;
            case "2":
                System.out.println("Checkout domain.Book \n" + "domain.User: \n");
                credential= scanner.nextLine();
                System.out.println("Password: \n");
                password= scanner.nextLine();
                if(UserService.verificationOfUserAdminAndPass(credential, password)) {
                    System.out.println("List of Books:  \n");
                    printCollectionBooks();
                    System.out.println("----------------------------------------------");
                    System.out.println("Name of domain.Book: \n");
                    String nameBook= scanner.nextLine();
                    verification = BookingService.removeBookToTheSystem(nameBook);
                    printMessageAboutCheckout(verification);
                    printCollectionBooks();
                }
                else{
                    System.out.println("Credential fail");
                }
                break;
            case "3":
                System.out.println("Return domain.Book \n" + "domain.User: \n");
                credential= scanner.nextLine();
                System.out.println("Password: \n");
                password= scanner.nextLine();
                if(UserService.verificationOfUserAdminAndPass(credential, password)) {
                    System.out.println("List of Books:  \n");
                    printCollectionBooks();
                    System.out.println("----------------------------------------------");
                    System.out.println("Name of domain.Book: \n");
                    String nameOfBook = scanner.nextLine();
                    System.out.println("Date: \n");
                    String date = scanner.nextLine();
                    System.out.println("Author: \n");
                    String author = scanner.nextLine();
                    Book book = new Book(nameOfBook, date, author);
                    verification = BookingService.addBookToTheSystem(book);
                    printMessageAboutAddBook(verification);
                    printCollectionBooks();
                }
                else{
                    System.out.println("Credential Fail");
                }
                break;
            case "4":
                System.out.println("List of Movies \n");
                printCollectionMovies();
                break;
            case "5":
                System.out.println("CheckOutMovies \n");
                System.out.println("List of Movies \n");
                printCollectionMovies();
                System.out.println("----------------------------------------------");
                System.out.println("Name of domain.Movie:");
                String nameOfMovie= scanner.nextLine();
                MovieService.removeMovieToTheSystem(nameOfMovie);
                System.out.println("----------------------------------------------");
                printCollectionMovies();
                break;
            default:
                System.out.println(this.printErrorChoiceMessage());
                break;
        }
    }

    public void printCollectionBooks(){
        for (Book item: BookingService.getCollectionBooks()) {
            System.out.println(item.getNameOfBook()+ " "+item.getYearOfPublished() +" "+ item.getAuthor());
        }
    }

    public void printCollectionMovies(){
        for (Movie movie: MovieService.getMovieList()) {
            System.out.println(movie.getNameMovie()+" "+movie.getYear()+" "+movie.getDirector()+" "+movie.getRanting());
        }
    }

    public boolean printMessageAboutCheckout(boolean verification){
            if(verification){
                System.out.println("Thank you! Enjoy the book");
                return true;
            }
            else {
                System.out.println("Sorry, that book is not available");
                return false;
            }
    }

    public boolean printMessageAboutAddBook(boolean verification){
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
