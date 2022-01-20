package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {
    private List<Course> courses = new ArrayList<>();

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> properCourse = Optional.empty();
        for (Course course : courses) {
            if (course.getPrice() <= maxPrice) {
                properCourse = Optional.of(course);
            }
        }
        return properCourse.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Integer> result = Optional.empty();
        for (Course course : courses) {
            if(course.getName().equals(name) && course.getLevel() == level){
                result = Optional.of(course.getPrice());
            }
        }
        return result.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level){
        Optional<String> result = Optional.empty();
        for(Course course : courses){
            if(course.getLevel() == level){
                result = Optional.of(course.getName());
            }
        }
        return result.orElse("Sorry, there is no course at this level.");
    }

    public List<Course> getCourses() {
        return courses;
    }
}
