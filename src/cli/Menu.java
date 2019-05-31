package cli;

import domain.Book;
import domain.Movie;
import service.BookingService;
import service.MovieService;
import service.UserService;

import java.util.Scanner;

public class Menu {

    public String createMenu() {
        String Menu = new String();
        Menu = "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut Book\n" +
                "3)Return Book \n" +
                "4)List of Movies \n"+
                "5)CheckOut Movie: \n"+
                "6)login \n" +
                "7)View My Information (you need login for this) \n"+
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
        return "do you want to continue with program?: ";
    }

    public void printReloadMenuAndOptionsMenu()
    {
        Scanner scanner= new Scanner(System.in);
        String option= "";
        System.out.println(printQuestionContinue());
        option= scanner.nextLine();
        if(option.equals("y") || option.equals("yes"))
        {
            System.out.println(createMenu());
            option=scanner.nextLine();
            receiveOptionChooseForUserAndCallTheActionSelect(option);
        }
    }

    public void receiveOptionChooseForUserAndCallTheActionSelect(String option) {
        Scanner scanner = new Scanner(System.in);
        switch (option){
            case "0":
                printAGoodbyeMessageAndEndTheApplicationProcess();
                printReloadMenuAndOptionsMenu();
                break;
            case "1":
                printAListOfBooks();
                printReloadMenuAndOptionsMenu();
                break;
            case "2":
                printInstructionAndAllowCheckoutOfBooks(scanner);
                printReloadMenuAndOptionsMenu();
                break;
            case "3":
                printInstructionAndAllowReturnOfBooks(scanner);
                printReloadMenuAndOptionsMenu();
                break;
            case "4":
                printListOfMovies();
                printReloadMenuAndOptionsMenu();
                break;
            case "5":
                PrintInstructionsAndAllowCheckoutMovies(scanner);
                printReloadMenuAndOptionsMenu();
                break;
            case "6":
                String user="";
                String pass="";
                System.out.println("User: ");
                user=scanner.nextLine();
                System.out.println("Pass: ");
                pass=scanner.nextLine();
                if(UserService.verificationOfUserAdminAndPass(user,pass))
                {
                    System.out.println("welcome "+ user + "you are admin");
                }
                else
                {
                    UserService.searchUserAndChangeState(user, pass);
                    System.out.println("fail");

                }
                printReloadMenuAndOptionsMenu();
                break;
            default:
                System.out.println(this.printErrorChoiceMessage());
                break;
        }
    }

    private void PrintInstructionsAndAllowCheckoutMovies(Scanner scanner) {
        System.out.println("CheckOutMovies \n");
        System.out.println("List of Movies \n");
        printCollectionMovies();
        System.out.println("----------------------------------------------");
        System.out.println("Name of Movie:");
        String nameOfMovie= scanner.nextLine();
        MovieService.removeMovieToTheSystem(nameOfMovie);
        System.out.println("----------------------------------------------");
        printCollectionMovies();
        return;
    }

    private void printListOfMovies() {
        System.out.println("List of Movies \n");
        printCollectionMovies();
        return;
    }

    private void printInstructionAndAllowReturnOfBooks(Scanner scanner) {
        String credential;
        String password;
        boolean verification;
        System.out.println("Return Book \n" + "User: \n");
        credential= scanner.nextLine();
        System.out.println("Password: \n");
        password= scanner.nextLine();
        if(UserService.verificationOfUserAdminAndPass(credential, password)) {
            System.out.println("List of Books:  \n");
            printCollectionBooks();
            System.out.println("----------------------------------------------");
            System.out.println("Name of Book: \n");
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
    }

    private void printInstructionAndAllowCheckoutOfBooks(Scanner scanner) {
        String credential;
        String password;
        boolean verification;
        System.out.println("Checkout Book \n" + "User: \n" +"\u001B[32m");
        credential= scanner.nextLine();
        System.out.println("Password: \n");
        password= scanner.nextLine();
        if(UserService.verificationOfUserAdminAndPass(credential, password)) {
            System.out.println("List of Books:  \n");
            printCollectionBooks();
            System.out.println("----------------------------------------------");
            System.out.println("Name of Book: \n");
            String nameBook= scanner.nextLine();
            verification = BookingService.removeBookToTheSystem(nameBook);
            printMessageAboutCheckout(verification);
            System.out.println(" \n");
            printCollectionBooks();
        }
        else{
            System.out.println("Credential fail");
        }
    }

    private void printAListOfBooks() {
        System.out.println("List of Books:  \n");
        printCollectionBooks();
        return;
    }

    private void printAGoodbyeMessageAndEndTheApplicationProcess() {
        System.out.println("Quit Application");
        return;
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
