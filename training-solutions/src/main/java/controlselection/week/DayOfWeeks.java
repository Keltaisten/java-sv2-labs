package controlselection.week;

import controlselection.month.DayInMonth;

public class DayOfWeeks {
    public String whichDay(String day){
        String selectedDay;
        switch(day.toLowerCase()){
            case "hétfő":
                selectedDay = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                selectedDay = "hét közepe";
                break;
            case "péntek":
                selectedDay = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                selectedDay = "hét vége";
                break;
            default: selectedDay = "ismeretlen nap";
        }

        return selectedDay;
    }

    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        System.out.println(dayOfWeeks.whichDay("Szombat"));
    }
}
