import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        Footballer f17 = new Footballer("KENT" ,21,"ENGLISH","RW","S",100 ,10);
        Footballer f18 = new Footballer("BECAO" ,21,"BRAZILIAN","LW","B",100 ,10);

        ArrayList<Footballer> fbForeignPlayers = new ArrayList<>();
        fbForeignPlayers.add(f15);
        fbForeignPlayers.add(f16);
        fbForeignPlayers.add(f17);
        fbForeignPlayers.add(f18);

        //  BJK PLAYERS

        Footballer f19 = new Footballer("ABOUBAKAR" ,21,"CAMEROONIAN","ST","S",100 ,10);
        Footballer f20 = new Footballer("GEDSON" ,21,"PORTUGUESE","CM","S",100 ,10);
        Footballer f21 = new Footballer("REBIC" ,21,"FRENCH","RB","A",100 ,10);
        Footballer f22 = new Footballer("ROSIER" ,21,"FRENCH","RB","A",100 ,10);

        ArrayList<Footballer> bjkForeignPlayers = new ArrayList<>();
        bjkForeignPlayers.add(f19);
        bjkForeignPlayers.add(f20);
        bjkForeignPlayers.add(f21);
        bjkForeignPlayers.add(f22);

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

        Footballer f39 = new Footballer("CASEMIRO", 31, "BRAZIL", "CDM", "I", 40, 15);
        Footballer f40 = new Footballer("ZAKARIA", 26, "SWITZERLAND", "CDM", "S", 20, 5);
        Footballer f41 = new Footballer("AL-MUSRATI", 27, "LIBYA", "CDM", "A", 15, 4);
        Footballer f42 = new Footballer("LEMINA", 29, "GABON", "CDM", "B", 10, 3);
        Footballer f43 = new Footballer("BENNASSER", 27, "MOROCCO", "CDM", "C", 1, 1);

        //  CM

        Footballer f44 = new Footballer("BARELLA" ,26,"ITALIAN","CM","I",60 ,10);
        Footballer f45 = new Footballer("NDOMBELE" ,26,"FRENCH","CM","S",0 ,7);
        Footballer f46 = new Footballer("MAJER" ,26,"CROATIAN","CM","A",0 ,7);
        Footballer f47 = new Footballer("MAL1" ,26,"TURKISH","CM","B",0 ,7);
        Footballer f48 = new Footballer("LUSAMBA" ,26,"CONGO","CM","C",0 ,7);


        //  CAM

        Footballer f49 = new Footballer("MAL2" ,26,"ITALIAN","CAM","I",60 ,10);
        Footballer f50 = new Footballer("MAL3" ,26,"FRENCH","CAM","S",0 ,7);
        Footballer f51 = new Footballer("MAL4" ,26,"CROATIAN","CAM","A",0 ,7);
        Footballer f52 = new Footballer("MAL5" ,26,"ITALIAN","CAM","B",0 ,7);
        Footballer f53 = new Footballer("PELKAS" ,26,"GREEK","CAM","C",0 ,7);

        //  LW

        Footballer f54 = new Footballer("MAL6" ,26,"ITALIAN","LW","I",60 ,10);
        Footballer f55 = new Footballer("MAL7" ,26,"FRENCH","LW","S",0 ,7);
        Footballer f56 = new Footballer("MAL8" ,26,"CROATIAN","LW","A",0 ,7);
        Footballer f57 = new Footballer("MAL9" ,26,"ITALIAN","LW","B",0 ,7);
        Footballer f58 = new Footballer("NANI" ,36,"PORTUGUESE","LW","C",0 ,7);

        //  RW
        Footballer f59 = new Footballer("MAL10" ,26,"ITALIAN","RW","I",60 ,10);
        Footballer f60 = new Footballer("MAL11" ,26,"FRENCH","RW","S",0 ,7);
        Footballer f61 = new Footballer("MAL12" ,26,"CROATIAN","RW","A",0 ,7);
        Footballer f62 = new Footballer("MAL13" ,26,"ITALIAN","RW","B",0 ,7);
        Footballer f63 = new Footballer("ZINEDINE FERHAT" ,26,"ALGERIAN","RW","C",0 ,7);

        //  ST
        Footballer f64 = new Footballer("MAL14" ,21,"TURK","ST","I",0 ,7);
        Footballer f65 = new Footballer("MAL15" ,21,"TURK","ST","S",0 ,7);
        Footballer f66 = new Footballer("MAL16" ,21,"TURK","ST","A",0 ,7);
        Footballer f67 = new Footballer("MAL17" ,21,"TURK","ST","B",0 ,7);
        Footballer f68 = new Footballer("OKAKA" ,21,"ITALIAN","ST","C",0 ,7);

        ArrayList<Footballer> globalPlayers = new ArrayList<>();
        globalPlayers.add(f23);
        globalPlayers.add(f24);
        globalPlayers.add(f35);
        globalPlayers.add(f36);
        globalPlayers.add(f62);
        globalPlayers.add(f63);
        globalPlayers.add(f67);
        globalPlayers.add(f68);
        globalPlayers.add(f56);
        globalPlayers.add(f55);
        globalPlayers.add(f51);
        globalPlayers.add(f50);
        globalPlayers.add(f28);
        globalPlayers.add(f27);
        globalPlayers.add(f31);
        globalPlayers.add(f32);
        globalPlayers.add(f41);
        globalPlayers.add(f40);
        globalPlayers.add(f46);
        globalPlayers.add(f45);



        System.out.println("Welcome to Football Simulator 23.4!");
        System.out.println("Please select game mode: ");
        System.out.println("1. Single player");
        System.out.println("2. Multiplayer");
        System.out.println("3. Quit");


            while (true) {
                Scanner scannerInt = new Scanner(System.in);
                Scanner scannerStr = new Scanner(System.in);


                try {
                    int choice;
                    choice = scannerInt.nextInt();
                    switch (choice) {
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
                                team1 = bjk;
                            } else if (select1 == 2) {
                                System.out.println("FB Selected");
                                team1 = fb;
                            } else {
                                System.out.println("Wrong team");
                            }

                            System.out.println("Player 2 Select Team ");
                            teamSelection();
                            int select2 = scannerInt.nextInt();
                            if (select2 == 1) {
                                System.out.println("BJK Selected");
                                team2 = bjk;
                            } else if (select2 == 2) {
                                System.out.println("FB Selected");
                                team2 = fb;
                            } else {
                                System.out.println("Wrong team");
                            }

                            if (team1.getTeamName().equals("Besiktas")) {
                                team1.transferTurkishPlayer(bjkTurksList, team1);
                                team2.transferTurkishPlayer(fbTurksList, team2);
                            } else if (team1.getTeamName().equals("Fenerbahce")) {
                                team1.transferTurkishPlayer(fbTurksList, team1);
                                team2.transferTurkishPlayer(bjkTurksList, team2);
                            }
                            System.out.println("\nTurkish Players has been chosen");

                            System.out.println("Select from club players");


                            if (team1.getTeamName().equals("Besiktas")) {
                                System.out.println("Team1 Starts");
                                team1.transferPlayerFromGivenList(bjkForeignPlayers, team1);
                                System.out.println("Team2 Starts");
                                team2.transferPlayerFromGivenList(fbForeignPlayers, team2);
                            } else if (team1.getTeamName().equals("Fenerbahce")) {
                                System.out.println("Team1 Starts");
                                team1.transferPlayerFromGivenList(fbForeignPlayers, team1);
                                System.out.println("Team2 Starts");
                                team2.transferPlayerFromGivenList(bjkForeignPlayers, team2);
                            }

                            System.out.println("Team1 Turn");
                            String position;

                            while(team1.checkTeamSize(team1) && (team2.checkTeamSize(team2))) {
                                System.out.println("Team1 Turn");
                                position ="";
                                position = selectPosition();
                                team1.transferPlayerFromGlobalList(globalPlayers,team1,position);
                                System.out.println("Team2 Turn");
                                position = "";
                                position = selectPosition();
                                team2.transferPlayerFromGlobalList(globalPlayers,team2,position);
                            }

                            while (!team1.checkTeamSize(team1)) {
                                position ="";
                                position = selectPosition();
                                System.out.println("Team1 Turn");
                                team1.transferPlayerFromGlobalList(globalPlayers,team1,position);
                            }

                            while (!team2.checkTeamSize(team2)) {
                                position ="";
                                position = selectPosition();
                                System.out.println("Team2 Turn");
                                team2.transferPlayerFromGlobalList(globalPlayers,team2,position);
                            }


                           /* if (team1.getTeamName().equals("Besiktas")) {
                                team1.transferPlayerFromGlobalList(globalPlayers,team1,position);
                                team2.transferPlayerFromGlobalList(globalPlayers,team2,position);
                            } else if (team1.getTeamName().equals("Fenerbahce")) {
                                team1.transferPlayerFromGlobalList(globalPlayers,team1,position);
                                team2.transferPlayerFromGlobalList(globalPlayers,team2,position);
                            }*/






                            System.out.println("BITTTII");
                            break;
                        case 3:
                            System.out.println("Hope to see you again soon");
                            System.exit(0);
                    }

                }catch (InputMismatchException e) {
                    System.out.println("Please Enter a Proper Input");

                }


            }

    }



    public static void teamSelection(){
        System.out.println("(1) BJK");
        System.out.println("(2) FB");
        System.out.println("\nType Number: ");
    }

    public static String selectPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter one of the following positions");
        System.out.println("\nGK\nCB - RB - LB\nCDM - CM - CAM\nLW - ST - RW");
        String chosenPosition = scanner.nextLine();
        return chosenPosition;
    }
}





