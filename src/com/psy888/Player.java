package com.psy888;

public class Player {
    private String firstName;
    private String lastName;
    private int number;
    private Skills skills;

    public Player(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.skills = new Skills(); //Композиция
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    //    пробежка
    public void run() {

    }

    //    забрать мячь
    public void takeBall() {

    }

    //      пас мяча игроку своей команды
    public boolean pass(Player opponent) {
        if(opponent==null){
            return true;
        }
        // todo сравнить skill вратаря и нападающего противника + random factor
        int result = this.skills.compare(opponent.getSkills());
//        System.out.println("=================================result = " + result);
        if(result>0){
            this.skills.addOnePoint();
            return true;
        }
        return false;
    }



    public boolean makeGoal(Player opponent){
        int result = this.skills.compare(opponent.getSkills());
        if(result>0){
            this.skills.addOnePoint();
            this.skills.addOnePoint();
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println(lastName + " " + firstName + " " + number + " " + this.getClass().getSimpleName());
    }


}
