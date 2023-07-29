import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {

        ArrayList<Footballer> fbList = new ArrayList<>();
        ArrayList<Footballer> bjkList = new ArrayList<>();
        ArrayList<Team> teamList = new ArrayList<>();

        // TEAMS

        Team fb = new Team("Fenerbahce",fbList,1000,100);
        Team bjk = new Team("Besiktas",bjkList,1000,100);
        teamList.add(bjk);
        teamList.add(fb);

        //  FB TURKS

        Footballer f1 = new Footballer("FERDI" ,23, "TURKISH","LB","S",0 ,0);
        Footballer f2 = new Footballer("CENGIZ" ,26,"TURKISH","RW","A",0 ,0);
        Footballer f3 = new Footballer("SALIH" ,25,"TURKISH","CDM","A",0 ,0);
        Footballer f4 = new Footballer("ZEKI" ,26,"TURKISH","RB","B",0 ,0);
        Footballer f5 = new Footballer("IRFAN CAN" ,21,"TURKISH","GK","B",0 ,0);
        Footballer f6 = new Footballer("MHY" ,21,"TURKISH","CM","B",0 ,0);
        Footballer f7 = new Footballer("ICK" ,21,"TURKISH","CAM","B",0 ,0);

        ArrayList<Footballer> fbTurksList = new ArrayList<>();
        fbTurksList.add(f1);
        fbTurksList.add(f2);
        fbTurksList.add(f3);
        fbTurksList.add(f4);
        fbTurksList.add(f5);
        fbTurksList.add(f6);
        fbTurksList.add(f7);
        //  BJK TURKS

        Footballer f8 = new Footballer("MERT G" ,21,"TURKISH","GK","A",0 ,0);
        Footballer f9 = new Footballer("CENK" ,21,"TURKISH","ST","A",0 ,0);
        Footballer f10 = new Footballer("SALIH" ,21,"TURKISH","CM","B",0 ,0);
        Footballer f11 = new Footballer("ONUR" ,21,"TURKISH","RB","B",0 ,0);
        Footballer f12 = new Footballer("TALHA" ,21,"TURKISH","CB","B",0 ,0);
        Footballer f13 = new Footballer("UMUT" ,21,"TURKISH","LB","C",0 ,0);
        Footballer f14 = new Footballer("ERSIN" ,21,"TURKISH","GK","C",0 ,0);

        ArrayList<Footballer> bjkTurksList = new ArrayList<>();
        bjkTurksList.add(f8);
        bjkTurksList.add(f9);
        bjkTurksList.add(f10);
        bjkTurksList.add(f11);
        bjkTurksList.add(f12);
        bjkTurksList.add(f13);
        bjkTurksList.add(f14);
        //  FB PLAYERS

        Footballer f15 = new Footballer("TADIC" ,21,"SERBIAN","LW","S",100 ,10);
        Footballer f16 = new Footballer("DZEKO" ,21,"BOSNIAN","ST","S",100 ,10);
        Footballer f17 = new Footballer("TETE" ,21,"BRAZILIAN","RW","S",100 ,10);
        Footballer f18 = new Footballer("TETE" ,21,"ENGLISH","LW","B",100 ,10);

        //  BJK PLAYERS

        Footballer f19 = new Footballer("ABOUBAKAR" ,21,"CAMEROONIAN","ST","S",100 ,10);
        Footballer f20 = new Footballer("GEDSON" ,21,"PORTUGUESE","CM","S",100 ,10);
        Footballer f21 = new Footballer("REBIC" ,21,"FRENCH","RB","A",100 ,10);
        Footballer f22 = new Footballer("ROSIER" ,21,"FRENCH","RB","A",100 ,10);

        //  GK

        Footballer f23 = new Footballer("NAVAS" ,36,"DOMINICAN","GK","S",5 ,5);
        Footballer f24 = new Footballer("LENO" ,31,"GERMAN","GK","A",8 ,3);
        Footballer f25 = new Footballer("PENA" ,21,"SPANISH","GK","B",100 ,10);
        Footballer f26 = new Footballer("MIGNOLET" ,21,"BELGIAN","GK","B",100 ,10);

        //  CB

        Footballer f27 = new Footballer("RAMOS" ,36,"SPANISH","CB","S",0 ,7);
        Footballer f28 = new Footballer("SANCHEZ" ,21,"COLOMBIAN","CB","S",0 ,7);
        Footballer f29 = new Footballer("MINA" ,21,"COLOMBIAN","CB","A",0 ,7);
        Footballer f30 = new Footballer("HOLDING" ,21,"ENGLISH","CB","B",0 ,7);

        //  RB

        Footballer f31 = new Footballer("DODO" ,21,"BRAZILIAN","RB","S",0 ,7);
        Footballer f32 = new Footballer("BUTA" ,21,"TURK","RB","A",0 ,7);
        Footballer f33 = new Footballer("PEMBELE" ,21,"FRENCH","RB","B",0 ,7);
        Footballer f34 = new Footballer("HADERGJONAJ" ,21,"DUTCH","RB","C",0 ,7);

        //  LB

        Footballer f35 = new Footballer("TAVARES" ,21,"PORTUGUESE","LB","S",0 ,7);
        Footballer f36 = new Footballer("TSIMIKAS" ,21,"GREEK","LB","A",0 ,7);
        Footballer f37 = new Footballer("SANUSI" ,21,"NIGERIAN","LB","B",0 ,7);
        Footballer f38 = new Footballer("MELNJAK" ,21,"CROTIAN","LB","C",0 ,7);

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

        System.out.println(bjkList.size());

        System.out.println("Welcome to Football Simulator 23.4!");
        System.out.println("Please select game mode: ");
        System.out.println("1. Single player");
        System.out.println("2. Multiplayer");
        System.out.println("3. Quit");

        while(true)
        {
            Scanner scannerInt = new Scanner(System.in);
            Scanner scannerStr = new Scanner(System.in);

            int choice;
            choice = scannerInt.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("This game mode is currently unavailable. Please try again later.");
                    System.out.println("Please select game mode: ");
                    break;

                case 2:
                    Team team1 = null;
                    Team team2 = null;
                    System.out.println("Multiplayer game is starting...");
                    System.out.println("Player 1 Select Team ");
                    teamSelection();

                    int select1 = scannerInt.nextInt();
                    if (select1 == 1) {
                        System.out.println("BJK Selected");
                        team1=bjk;
                    } else if (select1 == 2) {
                        System.out.println("FB Selected");
                        team1=fb;
                    }
                    else {
                        System.out.println("Wrong team");
                    }

                    System.out.println("Player 2 Select Team ");
                    teamSelection();
                    int select2 = scannerInt.nextInt();
                    if (select2 == 1) {
                        System.out.println("BJK Selected");
                        team2=bjk;
                    } else if (select2 == 2) {
                        System.out.println("FB Selected");
                        team2=fb;
                    }
                    else {
                        System.out.println("Wrong team");
                    }

                    if (team1.getTeamName().equals("Besiktas")) {
                        team1.transferTurkishPlayer(bjkTurksList,team1);
                        team2.transferTurkishPlayer(fbTurksList,team2);
                    }
                    else if (team1.getTeamName().equals("Fenerbahce")) {
                        team1.transferTurkishPlayer(fbTurksList,team1);
                        team2.transferTurkishPlayer(bjkTurksList,team2);
                    }


                    break;
                case 3:
                    System.out.println("Hope to see you again soon");
                    System.exit(0);
            }
        }
    }



    public static void teamSelection(){
        System.out.println("(1) BJK");
        System.out.println("(2) FB");
        System.out.println("\nType Number: ");
    }
}





