import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserService.defaultUserCharge();
        BookingService.chargeInitialBooks();
        MovieService.chargeDefaultMovieList();
        List<String> optionSelection= new ArrayList<>();
        optionSelection.add("0");
        optionSelection.add("1");
        optionSelection.add("2");
        optionSelection.add("3");
        optionSelection.add("4");
        optionSelection.add("5");
        String option="";
        String stringLoad="";
        Scanner scanner= new Scanner(System.in);
        Menu menu= new Menu();

        do {
            menu.printWelcomeMessage();
            System.out.println(stringLoad =menu.createMenu());
            option= scanner.next();
        } while(!optionSelection.contains(option));

        menu.receiveOptionChooseForUserAndCallTheActionSelect(option);
        }
}
