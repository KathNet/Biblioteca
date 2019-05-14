import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookingService.ChargeInitialBooks();
        List<String> optionSelection= new ArrayList<>();
        optionSelection.add("0");
        optionSelection.add("1");
        optionSelection.add("2");
        optionSelection.add("3");
        String option="";
        String stringLoad="";
        Scanner scanner= new Scanner(System.in);
        Menu menu= new Menu();

        do {
            menu.PrintWelcomeMessage();
            System.out.println(stringLoad =menu.CreateMenu());
            option= scanner.next();
        } while(!optionSelection.contains(option));

        menu.RecibeOptionChooseForUserAndCallTheActionSelect(option);



        }
}
