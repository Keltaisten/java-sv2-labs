package optional;

import java.util.Optional;

public class Course {
    private String name;
    private int price;
    private Level level;

    public Course(String name, Level level, int price) {
        this.name = name;
        this.price = price;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Level getLevel() {
        return level;
    }

    //    public Course getCheaperCourse(int maxPrice){
//        Optional<Course> e = Optional.of(this);
//
//    }
}
