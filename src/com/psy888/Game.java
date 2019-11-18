package com.psy888;

import java.util.Random;

public class Game {
    Match match;
    Random random;
    int curActivePlayerIndex;
    int[] attackOrder = new int[]{}; //
    int[] defenceOrder = new int[]{};

    public Game(Match match) {
        this.match = match;
        random = new Random();
    }

    private int getOpponentIndex() {
        switch (curActivePlayerIndex) {
            case 0: //goalkeeper
                return (isRandom()) ? -1 : getRandForwardIndex(); // -1 - no opponent
            case 1:
            case 2:
            case 3:
            case 4: //defender
                return (isRandom()) ? getRandMidfielderIndex() : getRandForwardIndex();
            case 5:
            case 6:
            case 7: //midfielder
                return (isRandom()) ? getRandDefenderIndex() : getRandMidfielderIndex();
            case 8:
            case 9:
            case 10: //forward
                return (isRandom()) ? getRandDefenderIndex() : getGoalkeeperIndex();
        }
        return -1;
    }

    private int getTeamMateIndex() {
        switch (curActivePlayerIndex) {
            case 0: //goalkeeper
                return (isRandom()) ? getRandDefenderIndex() : getRandMidfielderIndex();
            case 1:
            case 2:
            case 3:
            case 4: //defender
                return (isRandom()) ? getRandMidfielderIndex() : getRandForwardIndex();
            case 5:
            case 6:
            case 7: //midfielder
                return getRandForwardIndex();
            case 8:
            case 9:
            case 10: //forward
                int index = 0;
                do {
                    index = getRandForwardIndex();
                } while (index != curActivePlayerIndex);
                return (isRandom()) ? index : 99;
        }
        return 99;
    }

    private void attack() {
        boolean isGoal = false;
        do {
            Player playerWithBall = match.getCurTeamBall().getTeamPlayers()[curActivePlayerIndex];
            int opponentIndex = getOpponentIndex();
            int teamMateIndex = getTeamMateIndex();
            Player playerOpponent = null;
            try {
                playerOpponent = match.getOtherTeam().getTeamPlayers()[opponentIndex];
            } catch (IndexOutOfBoundsException ex) {
                /*ignore*/
            }
//            boolean isSuccess = false;
            //todo game logic here
            if(teamMateIndex<10) { // если пас
//                todo сравнить skill вратаря и нападающего противника + random factor
                boolean isSuccess = playerWithBall.pass(playerOpponent);
                if (isSuccess) {
                    curActivePlayerIndex = teamMateIndex; //мячь переходит к защитнику или полузащитнику
                } else {
                    match.changeCurTeamBall(); //мячь переходит к противнику
                    curActivePlayerIndex = opponentIndex;
                }
            }else{ //удар по воротам
//                todo сравнить skill вратаря и нападающего противника + random factor
                isGoal = playerWithBall.makeGoal(playerOpponent);
                if (isGoal) {
                    addTeamScore();
                    //todo передать мяч нападающему или полузащитнику другой команды
                    match.changeCurTeamBall();
                    curActivePlayerIndex = (isRandom())?getRandForwardIndex():getRandMidfielderIndex();
                }
            }
        } while (!isGoal);
            UI.msg("ГОЛ!!!");
//        attack();
    }

    public void startGame() {
        attack();
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


    private boolean isRandom() {
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
