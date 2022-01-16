package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return new ArrayList<>(lessons);
    }

//    public void addNewLesson(OnlineLesson lesson) {
//        int index = lessons.size();
//        for (int i = 0; i < lessons.size() - 1; i++) {
//            LocalDateTime startTimeOfLessonBefore = lessons.get(i).getStartOfLesson();
//            LocalDateTime startTimeOfLessonAfter = lessons.get(i + 1).getStartOfLesson();
//            if (startTimeOfLessonBefore.isBefore(lesson.getStartOfLesson()) && startTimeOfLessonAfter.isAfter(lesson.getStartOfLesson())) {
//                index = i + 1;
//            }
//        }
//        lessons.add(index, lesson);
//    }

    public void addNewLesson(OnlineLesson lesson) {
        boolean boolExit = true;
        int index = lessons.size();
        for (int i = 0; i < lessons.size(); i++) {
            if (lessons.get(i).getStartOfLesson().isAfter(lesson.getStartOfLesson()) && boolExit) {
//                lessons.add(i, lesson);
                index = i;
                boolExit = false;
            }
        }
        lessons.add(index, lesson);
    }

//    public List<OnlineLesson> getLessonsByTitle(String title) {
//        List<OnlineLesson> result = new ArrayList<>();
//        Iterator<OnlineLesson> iterator = lessons.iterator();
//        while (iterator.hasNext()) {
//            OnlineLesson lesson = iterator.next();
//            if (lesson.getNameOfLesson().equals(title)) {
//                result.add(lesson);
//            }
//        }
//        return result;
//    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson actual = iterator.next();
            String actualTitle = actual.getNameOfLesson();
            if (actualTitle.equals(title)) {
                result.add(actual);
            }
        }
        return result;
    }

//    public void removeLesson(LocalDateTime startTime) {
//        for (Iterator<OnlineLesson> iterator = lessons.iterator(); iterator.hasNext(); ) {
//            if (iterator.next().getStartOfLesson().equals(startTime)) {
//                iterator.remove();
//            }
//        }
//    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        boolean entrance = true;
        while (iterator.hasNext() && entrance) {
            OnlineLesson actual = iterator.next();
            LocalDateTime actualDateTime = actual.getStartOfLesson();
            if (actualDateTime.equals(startTime)) {
                iterator.remove();
                entrance = false;
            }
        }
    }

//    List<OnlineLesson> onlineLessons = new ArrayList<>();
//
//    public List<OnlineLesson> getOnlineLessons() {
//        return onlineLessons;
//    }
//
//
//

    public static void main(String[] args) {
//        HomeSchooling schooling;
//        schooling = new HomeSchooling();
//        schooling.addNewLesson(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 14, 8, 0)));
//        schooling.addNewLesson(new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 15, 8, 0)));
//        schooling.addNewLesson(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 16, 8, 0)));
////        List<OnlineLesson> expected = schooling.getLessonsByTitle("matematika");
////        System.out.println(expected.size());
//
//        OnlineLesson lesson = new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 14, 12, 0));
//        schooling.addNewLesson(lesson);
//
//        System.out.println(schooling.getOnlineLessons().size());
//        System.out.println(schooling.getOnlineLessons().indexOf(lesson));
////        assertEquals(4, schooling.getOnlineLessons().size());
////        assertEquals(1, schooling.getOnlineLessons().indexOf(lesson));
    }

    //        Iterator<OnlineLesson> iterator = onlineLessons.iterator();
//         while (iterator.hasNext()){
//
//             if(iterator.next().getStartOfLesson().isBefore(lesson.getStartOfLesson())){
//
//             }
//         }
}
