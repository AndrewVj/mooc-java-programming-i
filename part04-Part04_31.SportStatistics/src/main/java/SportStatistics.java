
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        Team team = new Team(teamName);
        
        try(Scanner fReader = new Scanner(Paths.get(fName))) {
            while(fReader.hasNextLine()) {
                String line = fReader.nextLine();
                if(line.isEmpty()) {
                    continue;
                }
                String[] words = line.split(",");
                String homeTeam = words[0];
                String visitingTeam = words[1];
                int homeTeamPts = Integer.valueOf(words[2]);
                int visitingTeamPts = Integer.valueOf(words[3]);
                
                if(homeTeam.equals(team.getTeamName()) || visitingTeam.equals(team.getTeamName())) {
                    team.incrementTeamCount();
                } else {
                    continue;
                }
                
                if(homeTeam.equals(team.getTeamName()) && homeTeamPts > visitingTeamPts) {
                    team.incrementTeamWins();
                }
                
                if(homeTeam.equals(team.getTeamName()) && homeTeamPts < visitingTeamPts) {
                    team.incrementTeamLosses();
                }
                
                if(visitingTeam.equals(team.getTeamName()) && visitingTeamPts > homeTeamPts) {
                    team.incrementTeamWins();
                }
                
                if(visitingTeam.equals(team.getTeamName()) && visitingTeamPts < homeTeamPts) {
                    team.incrementTeamLosses();
                }
                
            }
        } catch(Exception e) {
            System.out.println("Error "+e);
        }
        
        System.out.println("Games: "+team.getTeamCount());
        System.out.println("Wins: "+team.getTeamWins());
        System.out.println("Losses: "+team.getTeamLosses());
    }

}
