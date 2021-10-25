package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private LocalTime duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public void start(){
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("hétfői feladatok","felkelni, inni egy kávét, dolgozni, reggelizni, " +
                "\r\nmég dolgozni, ebédelni, konzultációra menni, boltba menni, javat tanulni, aludni menni");
        task.start();
        task.setDuration(LocalTime.of(12,00));
        System.out.println("Jegyzet készült: " + task.getStartDateTime());
        System.out.println("Feladat neve: " + task.getTitle() + ", Leírása: " + task.getDescription());
        System.out.println("Megadott idő: " + task.getDuration());
    }
}
