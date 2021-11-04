package controlselection.month;

import java.util.Locale;

public class DayInMonth {
    public int howManyDays(int year, String month){
        int days;
        switch(month.toLowerCase()){
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                days = 31;
                break;
            case "február":
                if(((year%4 == 0) && (!(year%100 ==0))) || (year%400 == 0)){
                    days = 29;
                }else{
                    days = 28;
                }
                break;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                days = 30;
                break;
            default: days = 0;
        }
        return days;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.howManyDays(2021,"Február"));
    }
}
