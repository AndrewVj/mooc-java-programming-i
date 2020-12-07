/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andrewvijay
 */
public class Team {
    
    private String teamName;
    private int teamCount;
    private int teamWins;
    private int teamLosses;
    
    public Team(String teamName) {
        this.teamName = teamName;
        this.teamCount = 0;
        this.teamWins = 0;
        this.teamLosses = 0;
    }
    
    public void incrementTeamCount() {
        this.teamCount++;
    }
    
    public void incrementTeamWins() {
        this.teamWins++;
    }
    
    public void incrementTeamLosses() {
        this.teamLosses++;
    }

    public int getTeamCount() {
        return teamCount;
    }

    public int getTeamWins() {
        return teamWins;
    }

    public int getTeamLosses() {
        return teamLosses;
    }

    public String getTeamName() {
        return teamName;
    }
    
}
