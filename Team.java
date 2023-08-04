import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Team {

    private String teamName;
    private String teamRating;
    private double teamAverageAge;
    private ArrayList<Footballer> teamPlayers;
    private double transferBudget;
    private double weeklyBudget;

    Scanner scanStr = new Scanner(System.in);
    Scanner scanInt = new Scanner(System.in);

    public Team(String teamName, ArrayList<Footballer> teamPlayers, double transferBudget, double weeklyBudget) {
        this.teamName = teamName;
        this.teamPlayers = teamPlayers;
        this.transferBudget = transferBudget;
        this.weeklyBudget = weeklyBudget;
    }

    public void setTeamAverageAge(double teamAverageAge) {
        this.teamAverageAge = teamAverageAge;
    }

    public void setTeamPlayers(ArrayList<Footballer> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public double getTransferBudget() {
        return transferBudget;
    }

    public void setTransferBudget(double transferBudget) {
        this.transferBudget = transferBudget;
    }

    public double getWeeklyBudget() {
        return weeklyBudget;
    }

    public void setWeeklyBudget(double weeklyBudget) {
        this.weeklyBudget = weeklyBudget;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(String teamRating) {
        this.teamRating = teamRating;
    }

    public double getTeamAverageAge() {
        return teamAverageAge;
    }

    public double setTeamAverageAge() {
        int ageSum = 0;
        double average = 0;
        for (int i = 0; i < teamPlayers.size(); i++) {
            ageSum += teamPlayers.get(i).getfAge();
        }
        average = ageSum / teamPlayers.size();
        return average;
    }

    public ArrayList<Footballer> getTeamPlayers() {
        return teamPlayers;
    }

    public void showTeamInfo(Team team) {
        System.out.println("Team Name: " + getTeamName());
        System.out.println("Team Rating: " + getTeamRating());
        System.out.println("Team Average Age: " + getTeamAverageAge());
        System.out.println("\nTeam's Footballers List");

        for (int i = 0; i < team.teamPlayers.size(); i++) {
            Footballer.footballerBio(team.teamPlayers.get(i));
        }

        System.out.println(getTeamName() + " have " + getTeamPlayers().size() + " players\n");
    }


    public void transferTurkishPlayer(ArrayList<Footballer> openList, Team team) {
        System.out.println("");

        for (int i = 0; i < openList.size(); i++) {
            openList.get(i).toString();
            Footballer.footballerBio(openList.get(i));

        }

        System.out.println("");
        System.out.println("Select 3 players from this list");

        for (int i = 0; i < 3; i++) {
            System.out.println("Type player name: ");
            String input = scanStr.nextLine();
            for (int x = 0; x < openList.size(); x++) {
                if (input.equals(openList.get(x).getfName())) {
                    team.teamPlayers.add(openList.get(x));
                    System.out.println(team.teamPlayers.size() + " Player Selected");
                }
            }

        }
        team.showTeamInfo(team);

    }

    public void transferPlayerFromGlobalList(ArrayList<Footballer> globalList, Team team, String position) {
        for (int i = 0; i < globalList.size(); i++) {
            if (globalList.get(i).getfPosition().equals(position)) {
                Footballer.footballerBio(globalList.get(i));
            }
        }

        System.out.println("Please Enter the Name of the Player to transfer");

        System.out.println("Type player name: ");
        String name = scanStr.nextLine();
        for (int x = 0; x < globalList.size(); x++) {
            if (name.equals(globalList.get(x).getfName())) {
                team.teamPlayers.add(globalList.get(x));
                System.out.println(team.teamPlayers.size() + " Player Selected");
            }
        }
        team.showTeamInfo(team);
    }




    public void transferPlayerFromGivenList(ArrayList<Footballer> givenList , Team team) {
        try {

            System.out.println("");

            for (int i = 0; i < givenList.size(); i++) {
                givenList.get(i).toString();
                Footballer.footballerBio(givenList.get(i));
            }
            System.out.println("");

            System.out.println("How many players do you want to select from this player list ? (0-3)");
            int input = scanInt.nextInt();
            boolean flag = true;

            while (flag) {
                if (input < 0 || input > 3) {
                    System.out.println("Invalid input(Must be between 0 and 3)");
                    System.out.println("How many players do you want to select from this player list ? (0-3)");
                    input = scanInt.nextInt();
                } else {
                    for (int i = 0; i < input; i++) {
                        System.out.println("Type player name: ");
                        String name = scanStr.nextLine();
                        for (int x = 0; x < givenList.size(); x++) {
                            if (name.equals(givenList.get(x).getfName())) {
                                team.teamPlayers.add(givenList.get(x));
                                System.out.println(team.teamPlayers.size() + " Player Selected");
                            }
                        }
                    }
                    team.showTeamInfo(team);
                    flag = false;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Give Proper Input");
        }
    }

    public boolean checkTeamSize(Team team) {
        if (team.teamPlayers.size() <= 11) {
            return true;
        }
        else {
            return false;
        }
    }






}
