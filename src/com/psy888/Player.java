package com.psy888;

public class Player {
    private String firstName;
    private String lastName;
    private int number;
    Skills skills;

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
    public void run(){

    }

//    забрать мячь
    public void takeBall(){

    }
//      пас мяча игроку своей команды
    public void pass(){

    }


}
