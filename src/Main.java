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
        Scanner scanner= new Scanner(System.in);
        Menu menu= new Menu();
        int count=0;
        do {
            if(count>0)
            {
                System.out.println("Enter a valid option \n");
            }
            System.out.println(menu.printWelcomeMessage());
            System.out.println(menu.createMenu());
            option= scanner.next();
            count++;
        } while(!Options.getOptions().contains(option));
        menu.receiveOptionChooseForUserAndCallTheActionSelect(option);
        }
}
