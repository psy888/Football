package com.psy888;

public class Match {
    private Team team1;
    private Team team2;
    private int team1Score;
    private int team2Score;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public void start(){

    }

    public void info(){
        System.out.println("Матч " + team1.getName() + " vs " + team2.getName());
        System.out.println(team1.getName() + " : ");
        team1.info();
        System.out.println();
        System.out.println();
        System.out.println(team2.getName() + " : ");
        team2.info();

    }

}
