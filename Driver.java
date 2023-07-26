import java.sql.SQLOutput;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {

        System.out.println("Welcome to Football Simulator 23.4!");
        System.out.println("Please select game mode: ");
        System.out.println("1. Single player");
        System.out.println("2. Multiplayer");
        System.out.println("3. Quit");

        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            int choice;
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("This game mode is currently unavailable. Please try again later.");
                    System.out.println("Please select game mode: ");
                    break;

                case 2:
                    System.out.println("Multiplayer game is starting...");
                    break;
                case 3:
                    System.out.println("Hope to see you again soon");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
