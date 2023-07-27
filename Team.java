import java.util.ArrayList;

public class Team {

    private String teamName;
    private String teamRating;
    private double teamAverageAge;
    private ArrayList<Footballer> teamPlayers;
    private double transferBudget;
    private double weeklyBudget;

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
        int ageSum=0;
        double average=0;
        for (int i=0;i<teamPlayers.size();i++) {
           ageSum += teamPlayers.get(i).getfAge();
        }
        average = ageSum/teamPlayers.size();
        return average;
    }

    public ArrayList<Footballer> getTeamPlayers() {
        return teamPlayers;
    }

    public void showTeamInfo(Team team) {
        System.out.println("Team Name: " + getTeamName());
        System.out.println("Team Rating: " +getTeamRating());
        System.out.println("Team Average Age: " +getTeamAverageAge());
        System.out.println("\nTeam's Footballers List");

        for (int i=0;i<team.teamPlayers.size();i++) {
            Footballer.footballerBio(team.teamPlayers.get(i));
        }
        System.out.println("");
    }






}
