package com.psy888;

import java.util.Comparator;

public class Skills {
    //https://www.ertheo.com/blog/en/elements-success-in-football/
    private int technique; //1. Technique – ball control, dribbling skills, passing accuracy, body control
    private int intelligence; //2. Game intelligence – spatial awareness, tactical knowledge, risk assessment
    private int physical; // 3. Physical fitness – endurance, balance and coordination, speed, strength and power
    private int mindset; // 4. Proper mindset – compasssion, composure and mental strength, coachability, self-motivation


    public Skills() {
    }

    public Skills(int technique, int intelligence, int physical, int mindset) {
        this.technique = limitCheck(technique);
        this.intelligence = limitCheck(intelligence);
        this.physical = limitCheck(physical);
        this.mindset = limitCheck(mindset);
    }

    private int limitCheck(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 100) {
            return 100;
        }
        return i;
    }

    public int getTechnique() {
        return technique;
    }

    public void setTechnique(int technique) {
        this.technique = limitCheck(technique);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = limitCheck(intelligence);
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = limitCheck(physical);
    }

    public int getMindset() {
        return mindset;
    }

    public void setMindset(int mindset) {
        this.mindset = limitCheck(mindset);
    }

    /**
     * get allSkills
     *
     * @return int[] {technique,intelligence, physical, mindset}
     */
    public int[] getSkils() {
        return new int[]{this.technique, this.intelligence, this.physical, this.mindset};
    }

    /**
     * @param opponentSkills
     * @return 1 - won, -1 - lose
     */
    public int compare(Skills opponentSkills) {
        int mind = compareInt(this.mindset , opponentSkills.getMindset());
        int physic = compareInt(this.physical, opponentSkills.getPhysical());
        int intelli = compareInt(this.intelligence, opponentSkills.getIntelligence());
        int tech = compareInt(this.technique, opponentSkills.getTechnique());
        //случай...
        int destiny = (int) (Math.random() * 11);
//        System.out.println("========================================destiny = " + destiny);

        int total = mind + physic + intelli + tech;

        if (total == 0 && destiny < 2) {
            return 1;
        } else if (total == 0) {
            return -1;
        }

        if (total > 2 && destiny != 8) {
            return 1;
        } else {
            return -1;
        }

    }

    int compareInt(int a, int b){
        if (a>b){
            return 1;
        }else if(a<b){
            return -1;
        }else{
            return 0;
        }
    }

    public void addOnePoint() {
        int whichSkill = (int) (Math.random() * 4);
        switch (whichSkill) {
            case 0:
                mindset++;
                break;
            case 1:
                physical++;
                break;
            case 2:
                intelligence++;
                break;
            case 3:
                technique++;
                break;
        }
    }
}
