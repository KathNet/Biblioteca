import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String option= new String();
        Menu menu= new Menu();
        System.out.print(menu.PrintWelcomeMessage());
        System.out.println(menu.CreateMenu());
        Scanner key = new Scanner(System.in);
        option=key.next();
        String Result = menu.RecibeOptionChooseForUserAndCallTheActionSelect(option);
        if(Result=="Quit Application"){
            System.out.println("Quit Application");
            System.exit(0);
        }
        else {
            System.out.println(Result);
        }

    }






}
