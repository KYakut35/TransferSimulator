import java.sql.SQLOutput;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {

        //  FB TURKS

        Footballer f1 = new Footballer("FERDI" ,23, "TURKISH","LB","S",0 ,0);
        Footballer f2 = new Footballer("CENGIZ" ,26,"TURKISH","RW","A",0 ,0);
        Footballer f3 = new Footballer("MERT M" ,21,"TURKISH","RB","B",0 ,0);
        Footballer f4 = new Footballer("ISMAIL" ,21,"TURKISH","CDM","B",0 ,0);
        Footballer f5 = new Footballer("IRFAN CAN" ,21,"TURKISH","GK","B",0 ,0);
        Footballer f6 = new Footballer("MHY" ,21,"TURKISH","CM","B",0 ,0);
        Footballer f7 = new Footballer("ICK" ,21,"TURKISH","CAM","B",0 ,0);

        //  BJK TURKS

        Footballer f8 = new Footballer("MERT G" ,21,"TURKISH","GK","A",0 ,0);
        Footballer f9 = new Footballer("CENK" ,21,"TURKISH","ST","A",0 ,0);
        Footballer f10 = new Footballer("SALIH" ,21,"TURKISH","CM","A",0 ,0);
        Footballer f11 = new Footballer("ONUR" ,21,"TURKISH","RB","B",0 ,0);
        Footballer f12 = new Footballer("TALHA" ,21,"TURKISH","CB","B",0 ,0);
        Footballer f13 = new Footballer("UMUT" ,21,"TURKISH","LB","C",0 ,0);
        Footballer f14 = new Footballer("ERSIN" ,21,"TURKISH","GK","C",0 ,0);

        //  FB PLAYERS

        Footballer f15 = new Footballer("TADIC" ,21,"SERBIAN","LW","S",100 ,10);
        Footballer f16 = new Footballer("DZEKO" ,21,"BOSNIAN","ST","S",100 ,10);
        Footballer f17 = new Footballer("BECAO" ,21,"BRAZILIAN","CB","B",100 ,10);
        Footballer f18 = new Footballer("KENT" ,21,"ENGLISH","LW","B",100 ,10);

        //  BJK PLAYERS

        Footballer f19 = new Footballer("ABOUBAKAR" ,21,"CAMEROONIAN","ST","S",100 ,10);
        Footballer f20 = new Footballer("GEDSON" ,21,"PORTUGUESE","CM","S",100 ,10);
        Footballer f21 = new Footballer("ROSIER" ,21,"FRENCH","RB","A",100 ,10);
        Footballer f22 = new Footballer("AMARTEY" ,21,"GHANAIAN","CB","B",100 ,10);

        //  GK

        Footballer f23 = new Footballer("Navas" ,36,"DOMINICAN","GK","S",5 ,5);
        Footballer f24 = new Footballer("Leno" ,31,"GERMAN","GK","A",8 ,3);
        Footballer f25 = new Footballer("Pena" ,21,"SPANISH","GK","B",100 ,10);
        Footballer f26 = new Footballer("Mignolet" ,21,"BELGIAN","GK","B",100 ,10);

        //  CB

        Footballer f27 = new Footballer("Ramos" ,36,"SPANISH","CB","S",0 ,7);
        Footballer f28 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f29 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f30 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  RB

        Footballer f31 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f32 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f33 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f34 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  LB

        Footballer f35 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f36 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f37 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f38 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  CDM

        Footballer f39 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f40 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f41 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f42 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  CM

        Footballer f43 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f44 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f45 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f46 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  CAM

        Footballer f47 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f48 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f49 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f50 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  LW

        Footballer f51 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f52 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f53 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f54 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  RW
        Footballer f55 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f56 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f57 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f58 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

        //  ST
        Footballer f59 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f60 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f61 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);
        Footballer f62 = new Footballer("Ramos" ,21,"TURK","CB","S",0 ,7);

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
