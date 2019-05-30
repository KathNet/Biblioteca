import cli.Menu;
import cli.Options;
import service.BookingService;
import service.MovieService;
import service.UserService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Options.loadAvailableOptions();
        UserService.loadDefaultUsers();
        BookingService.loadInitialBooks();
        MovieService.loadDefaultMovieList();

        String option="";
        String stringLoad="";
        Scanner scanner= new Scanner(System.in);
        Menu menu= new Menu();

        do {
            menu.printWelcomeMessage();
            System.out.println(stringLoad =menu.createMenu());
            option= scanner.next();
        } while(!Options.getOptions().contains(option));

        menu.receiveOptionChooseForUserAndCallTheActionSelect(option);
        }
}
