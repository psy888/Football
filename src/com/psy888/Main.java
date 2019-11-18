package com.psy888;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Реал Мадрид
        Forward forward10 = new Forward("Эден", "Азар", 7);
        Forward forward9 = new Forward("Гарет", "Бейл", 11);
        Forward forward8 = new Forward("Карим", "Бензема", 9);
//        forward8.setSkills(new Skills(5,8,7,2));

        Midfielder midfielder7 = new Midfielder("Хамес", "Родригес",16);
        Midfielder midfielder6 = new Midfielder("Лука", "Модрич",10);
        Midfielder midfielder5 = new Midfielder("", "Иско",22);

        Defender defender4 = new Defender("Серхио","Рамос",4);
//        defender4.setSkills(new Skills(8,2,5,3));
        Defender defender3 = new Defender("Марсело","Виейра",12);
        Defender defender2 = new Defender("Милитан","Эдер",14);
        Defender defender1 = new Defender("Рафаэль","Варан",5);

        Goalkeeper goalkeeper = new Goalkeeper("Куртуа", "Тибо",1);
//        goalkeeper.setSkills(new Skills(4,5,3,4));

        Team realMadrid = new Team("Реал Мадрид",
                "Белая",
                "Испания",
                0,
                0,
                new Player[]{
                        goalkeeper,
                        defender1,
                        defender2,
                        defender3,
                        defender4,
                        midfielder5,
                        midfielder6,
                        midfielder7,
                        forward8,
                        forward9,
                        forward10
                });


        //Барселона
        Forward second_forward10 = new Forward("Лионель", "Месси", 10);
//        second_forward10.setSkills(new Skills(5,8,7,5));
        Forward second_forward9 = new Forward("Карлес", "Перес", 27);
        Forward second_forward8 = new Forward("Антуан", "Гризманн", 17);

        Midfielder second_midfielder7 = new Midfielder("Френки", "де Йонг",21);
        Midfielder second_midfielder6 = new Midfielder("Артуро", "Видаль",22);
        Midfielder second_midfielder5 = new Midfielder("Иван", "Ракитич",4);
//        second_midfielder5.setSkills(new Skills(3,2,5,1));

        Defender second_defender4 = new Defender("Жерар","Пике",3);
        Defender second_defender3 = new Defender("Фирпо","Хуниор",24);
        Defender second_defender2 = new Defender("Жан-Клер","Тодибо",6);
        Defender second_defender1 = new Defender("Жорди","Альба",18);

        Goalkeeper second_goalkeeper = new Goalkeeper("Нето", "Норберто Мурара",13);
//        second_goalkeeper.setSkills(new Skills(5,4,5,3));

        Team barcelona = new Team("Барселона",
                "Сине-гранатовые",
                "Испания",
                0,
                0,
                new Player[]{
                        second_goalkeeper,
                        second_defender1,
                        second_defender2,
                        second_defender3,
                        second_defender4,
                        second_midfielder5,
                        second_midfielder6,
                        second_midfielder7,
                        second_forward8,
                        second_forward9,
                        second_forward10
                });

        Match elClasico = new Match(realMadrid, barcelona);
        elClasico.start();

    }
}
