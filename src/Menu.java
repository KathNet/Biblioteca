import java.util.List;

public class Menu {

    public String CreateMenu() {
        String Menu = new String();
        Menu = "\nChose Option:\n" +
                "1)List of Books\n" +
                "2)CheckOut Book\n" +
                "3)Return Book \n" +
                "0)Exit\n"+
                "Option: ";
        return Menu;
    }

    public String PrintWelcomeMessage(){
        String Massage= "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return Massage;
    }


    public String RecibeOptionChooseForUserAndCallTheActionSelect(String option) {
        String Message= "Please select a valid option!";
        if(option.equals("0")) {
            Message="Quit Application";
        }
        if (option.equals("1")) {
            BooksList booksList = new BooksList();
            Message = ReturnListOfBooksInScreen(booksList.ReturnAListOfBooksInSystem());
        }
        if(option.equals("2")){
            Message="Write the name of book: \n";
        }
        if(option.equals("3")){
            Message= "Return Book: \n";
        }
        return Message;
    }

    public String ReturnListOfBooksInScreen(List<Book> ListBook) {
        String CollectionOfBooks = new String();
        for (int i=0; i<CollectionOfBooks.length(); i++) {
            CollectionOfBooks+=ListBook.get(i).NameOfBook+" "+ListBook.get(i).Author+" "+ListBook.get(i).YearOfPublished+" \n";
        }
        return CollectionOfBooks;
    }

    public boolean PrintMessageAboutCheckout(boolean verification){
            if(verification){
                System.out.println("Thank you! Enjoy the book");
                return true;
            }
            else {
                System.out.println("Unsuccessful message on checkout of a book");
                return false;
            }
    }

    public boolean PrintMessageNotifiedOnSuccessfulReturn(Book book){
            BooksList booksList = new BooksList();
            booksList.AddBookToTheSystem(book);
            System.out.println("Thank you for returning the book”");
            return true;
    }


}
