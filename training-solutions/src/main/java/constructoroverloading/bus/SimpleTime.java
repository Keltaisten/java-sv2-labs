package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(SimpleTime time) {
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getDifference(SimpleTime time){
        int oneTime = this.hours * 60 + this.minutes;
        int otherTime = time.hours * 60 + time.minutes;
        return oneTime-otherTime;
    }

    public int getMinutesPlusHours(){
        return this.hours * 60 + this.minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
