public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPts;
    private int visitingTeamPts;

    public Game(String homeTeam, String visitingTeam, int homeTeamPts, int visitingTeamPts) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPts = homeTeamPts;
        this.visitingTeamPts = visitingTeamPts;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public boolean winnerIs(String teamName) {
        if (teamName.equals(homeTeam) && homeTeamPts > visitingTeamPts) {
            return true;
        }

        if (teamName.equals(visitingTeam) && visitingTeamPts > homeTeamPts) {
            return true;
        }

        return false;
    }

}
