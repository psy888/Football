package com.psy888;

public class Team {
    private String name;
    private String color;
    private String country;
    private int points;
    private int totalPoints;
    //Aggregation*
    private Goalkeeper goalkeeper; //01

    private Defender rightDefender; //02
    private Defender leftDefender; //03
    private Defender centralDefender; //04
    private Defender centralDefender2; //05

    private Midfielder rightMidfielder; //06
    private Midfielder leftMidfielder; //07
    private Midfielder centralMidfielder; //08

    private Forward centralForward;//09
    private Forward rightForward;//10
    private Forward leftForward;//11


    Player[] teamPlayers = new Player[11];

    {
        teamPlayers[0] = goalkeeper;
        teamPlayers[1] = rightDefender;
        teamPlayers[2] = leftDefender;
        teamPlayers[3] = centralDefender;
        teamPlayers[4] = centralDefender2;
        teamPlayers[5] = rightMidfielder;
        teamPlayers[6] = leftMidfielder;
        teamPlayers[7] = centralMidfielder;
        teamPlayers[8] = centralForward;
        teamPlayers[9] = rightForward;
        teamPlayers[10] = leftForward;

    }

    public Team() {
    }

    public Team(String name, String color, String country, int points, int totalPoints) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.points = points;
        this.totalPoints = totalPoints;
    }

    public Team(String name, String color, String country, int points, int totalPoints, Player[] teamPlayers) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.points = points;
        this.totalPoints = totalPoints;
        this.teamPlayers = teamPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Goalkeeper getGoalkeeper() {
        return goalkeeper;
    }

    public void setGoalkeeper(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    public Defender getRightDefender() {
        return rightDefender;
    }

    public void setRightDefender(Defender rightDefender) {
        this.rightDefender = rightDefender;
    }

    public Defender getLeftDefender() {
        return leftDefender;
    }

    public void setLeftDefender(Defender leftDefender) {
        this.leftDefender = leftDefender;
    }

    public Defender getCentralDefender() {
        return centralDefender;
    }

    public void setCentralDefender(Defender centralDefender) {
        this.centralDefender = centralDefender;
    }

    public Defender getCentralDefender2() {
        return centralDefender2;
    }

    public void setCentralDefender2(Defender centralDefender2) {
        this.centralDefender2 = centralDefender2;
    }

    public Midfielder getRightMidfielder() {
        return rightMidfielder;
    }

    public void setRightMidfielder(Midfielder rightMidfielder) {
        this.rightMidfielder = rightMidfielder;
    }

    public Midfielder getLeftMidfielder() {
        return leftMidfielder;
    }

    public void setLeftMidfielder(Midfielder leftMidfielder) {
        this.leftMidfielder = leftMidfielder;
    }

    public Midfielder getCentralMidfielder() {
        return centralMidfielder;
    }

    public void setCentralMidfielder(Midfielder centralMidfielder) {
        this.centralMidfielder = centralMidfielder;
    }

    public Forward getCentralForward() {
        return centralForward;
    }

    public void setCentralForward(Forward centralForward) {
        this.centralForward = centralForward;
    }

    public Forward getRightForward() {
        return rightForward;
    }

    public void setRightForward(Forward rightForward) {
        this.rightForward = rightForward;
    }

    public Forward getLeftForward() {
        return leftForward;
    }

    public void setLeftForward(Forward leftForward) {
        this.leftForward = leftForward;
    }

    public Player[] getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(Player[] teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public void info() {
        System.out.println("Команда " + name + "представляет страну : " + country + "\n" +
                "Состав :");

        for (int i = 0; i < teamPlayers.length; i++) {
            Player teamPlayer = teamPlayers[i];
            if (teamPlayer == null) {
                System.out.println("Место # " + (i + 1) + " в команде не занято");
            } else {
                teamPlayer.info();
            }

        }
    }
}
