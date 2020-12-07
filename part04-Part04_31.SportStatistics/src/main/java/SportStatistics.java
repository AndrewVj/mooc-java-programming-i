import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();
        System.out.println("Team:");
        String teamName = scanner.nextLine();

        ArrayList<Game> games = getGameList(fileName);

        int gameCnt = 0;
        for (Game g : games) {
            if (g.getHomeTeam().equals(teamName) || g.getVisitingTeam().equals(teamName)) {
                gameCnt++;
            }
        }
        System.out.println("Games: " + gameCnt);

        int teamWins = 0;

        for (Game g : games) {
            if (g.winnerIs(teamName)) {
                teamWins++;
            }
        }
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + (gameCnt - teamWins));
    }

    public static ArrayList<Game> getGameList(String fName) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fReader = new Scanner(Paths.get(fName))) {
            while (fReader.hasNextLine()) {
                String line = fReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] words = line.split(",");
                String homeTeam = words[0];
                String visitingTeam = words[1];
                int homeTeamPts = Integer.valueOf(words[2]);
                int visitingTeamPts = Integer.valueOf(words[3]);
                games.add(new Game(homeTeam, visitingTeam, homeTeamPts, visitingTeamPts));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return games;
    }
}
