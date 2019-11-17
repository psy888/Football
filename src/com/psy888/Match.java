package com.psy888;

public class Match {
    private Team team1;
    private Team team2;
    private int team1Score;
    private int team2Score;
    private Team curTeamBall;
    private Game game;

    public int getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }



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

    public Team getCurTeamBall() {
        return curTeamBall;
    }

    public Team getOtherTeam() {
        return (curTeamBall == team1) ? team2 : team1;
    }



    public void changeCurTeamBall() {
        this.curTeamBall = (curTeamBall == team1) ? team2 : team1;
    }

    public void start() {

//        todo: game process here
        System.out.println("Подбрасывается манетка");
        curTeamBall = (coin()) ? team1 : team2;

        System.out.println("Команда " + curTeamBall.getName() + " начинает игру");

        game = new Game(this);
        game.startGame();



    }

    private boolean coin() {
        int coin = (int) (Math.round(Math.random()));
        return coin != 0;
    }

    public void info() {
        System.out.println("Матч " + team1.getName() + " vs " + team2.getName());
        System.out.println(team1.getName() + " : ");
        team1.info();
        System.out.println();
        System.out.println();
        System.out.println(team2.getName() + " : ");
        team2.info();

    }



}
