package methodoverloading;

import java.time.LocalTime;

public class Time {

    private LocalTime localTime;

    public boolean isEqual(Time time){
        return localTime.equals(time.localTime);
    }

    public boolean isEqual(int hours, int minutes, int seconds){
        return localTime.equals(LocalTime.of(hours,minutes,seconds));
    }

    public boolean isEarlier(Time time){
        return time.localTime.isAfter(localTime);
    }

    public boolean isEarlier(int hours, int minutes, int seconds){
        return LocalTime.of(hours,minutes,seconds).isAfter(localTime);
    }

    public Time(int hours, int minutes, int seconds) {
        this.localTime = LocalTime.of(hours,minutes,seconds);
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public int getHours(){
        return localTime.getHour();
    }

    public int getMinutes(){
        return localTime.getMinute();
    }

    public int getSeconds(){
        return localTime.getSecond();
    }

}
