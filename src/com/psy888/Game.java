package com.psy888;

import java.util.Random;

public class Game {
    Match match;
    Random random;
    Player curActivePlayerIndex;

    public Game(Match match) {
        this.match = match;
        random = new Random();
    }

    private void begin() {
        boolean isGoal = false;
        do {
            //todo game logic here
        } while (!isGoal);

        addTeamScore();

        match.changeCurTeamBall();

        begin();
    }

    public void startGame() {

    }


    private int getRandForwardIndex() {
        return random.nextInt(3) + 8; //8 - 10
    }

    private int getRandDefenderIndex() {
        return random.nextInt(4) + 1; //1 - 4
    }

    private int getRandMidfielderIndex() {
        return random.nextInt(3) + 5; //5 - 7
    }

    private int getGoalkeeperIndex() {
        return 0; //0
    }


    private boolean isSuccess() {
        int coin = (int) (Math.round(Math.random()));
        return coin != 0;
    }

    public void addTeamScore() {
        if (match.getCurTeamBall() == match.getTeam1()) {
            match.setTeam1Score(match.getTeam1Score() + 1);
        } else {
            match.setTeam2Score(match.getTeam2Score() + 1);
        }
    }
}
