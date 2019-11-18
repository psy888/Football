package com.psy888;

public class UI {

    public static void msg(String msg){
        System.out.println(msg);
    }

    public static String getPositionName(int index){
        switch (index) {
            case 0: //goalkeeper
                return "Вратарь";
            case 1:
            case 2:
            case 3:
            case 4: //defender
                return "Защитник";
            case 5:
            case 6:
            case 7: //midfielder
                return "Полузащитник";
            case 8:
            case 9:
            case 10: //forward
                return "Нападающий";
            default:
                return "";
        }
    }
}
