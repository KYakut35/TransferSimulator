import java.sql.SQLOutput;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = scanner.nextInt();

        System.out.println("Welcome to Football Simulator");
        System.out.println("Select game mode: ");
        System.out.println("1. Single player");
        System.out.println("2. Multiplayer");
        System.out.println("3. Quit");

        switch(choice)
        {
            case 1:

            case 2:

            case 3:
                scanner.close();
                System.exit(0);
        }
    }
}
