import java.util.List;

public class Menu {

    public String CreateMenu() {
        String Menu = new String();
        Menu = "Chose Option: \n 1)List of Books \n Option: ";
        return Menu;
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
            return false;
    }
}
