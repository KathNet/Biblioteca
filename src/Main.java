import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print(PrintWelcomeMessage());
        Menu menu= new Menu();
        menu.CreateMenu();
        Scanner key = new Scanner(System.in);
        String Result = menu.RecibeOptionChooseForUserAndCallTheActionSelect(key.toString());
        if(Result=="Quit Application"){
            System.exit(0);
        }

    }

    public static String PrintWelcomeMessage(){
        String Massage= "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return Massage;
    }




}
