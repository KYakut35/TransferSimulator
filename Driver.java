import java.sql.SQLOutput;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {

        //  FB TURKS

        Footballer f1 = new Footballer("Ferdi" ,21,"LB","S",0 ,0);
        Footballer f2 = new Footballer("Cengiz" ,21,"RW","A",0 ,0);
        Footballer f3 = new Footballer("Mert M" ,21,"RB","B",0 ,0);
        Footballer f4 = new Footballer("Ismail" ,21,"CDM","B",0 ,0);
        Footballer f5 = new Footballer("Irfan Can" ,21,"GK","B",0 ,0);
        Footballer f6 = new Footballer("Mhy" ,21,"CM","B",0 ,0);
        Footballer f7 = new Footballer("Ick" ,21,"CAM","B",0 ,0);

        //  BJK TURKS

        Footballer f8 = new Footballer("Mert G" ,21,"GK","A",0 ,0);
        Footballer f9 = new Footballer("Cenk" ,21,"ST","A",0 ,0);
        Footballer f10 = new Footballer("Salih" ,21,"CM","A",100 ,10);
        Footballer f11 = new Footballer("Onur" ,21,"RB","B",100 ,10);
        Footballer f12 = new Footballer("Talha" ,21,"CB","B",0 ,0);
        Footballer f13 = new Footballer("Umut" ,21,"LB","C",0 ,0);
        Footballer f14 = new Footballer("Ersin" ,21,"GK","C",0 ,0);

        //  FB PLAYERS

        Footballer f15 = new Footballer("Tadic" ,21,"LW","S",100 ,10);
        Footballer f16 = new Footballer("Dzeko" ,21,"ST","S",100 ,10);
        Footballer f17 = new Footballer("Becao" ,21,"CB","B",100 ,10);
        Footballer f18 = new Footballer("Kent" ,21,"LW","B",100 ,10);

        //  BJK PLAYERS

        Footballer f19 = new Footballer("Aboubakar" ,21,"ST","S",100 ,10);
        Footballer f20 = new Footballer("Gedson" ,21,"CM","S",100 ,10);
        Footballer f21 = new Footballer("Rosier" ,21,"RB","A",100 ,10);
        Footballer f22 = new Footballer("Amartey" ,21,"CB","B",100 ,10);

        //  GK

        Footballer f23 = new Footballer("Navas" ,36,"GK","S",5 ,5);
        Footballer f24 = new Footballer("Leno" ,31,"GK","A",8 ,3);
        Footballer f25 = new Footballer("Pena" ,21,"GK","B",100 ,10);
        Footballer f26 = new Footballer("Mignolet" ,21,"GK","B",100 ,10);

        //  CB

        Footballer f27 = new Footballer("Ramos" ,21,"CB","S",0 ,7);

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
