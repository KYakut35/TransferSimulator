import java.util.ArrayList;

public class Team {

    private String teamName;
    private String teamRating;
    private double teamAverageAge;
    private ArrayList<Footballer> teamPlayers;

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

    public void setTeamAverageAge() {
        int ageSum=0;
        double average=0;
        for (int i=0;i<teamPlayers.size();i++) {
           ageSum += teamPlayers.get(i).getfAge();
        }
        average = ageSum/teamPlayers.size();
        this.teamAverageAge = average;
    }

    public ArrayList<Footballer> getTeamPlayers() {
        return teamPlayers;
    }

    public void showTeamInfo(Team team) {
        System.out.println("Team Name: " + getTeamName());
        System.out.println("Team Rating: " +getTeamRating());
    }



    public Team(String teamName) {
        this.teamName = teamName;
        setTeamAverageAge();
    }


}
