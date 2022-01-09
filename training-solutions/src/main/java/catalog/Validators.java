package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String word) {
        if (word != null && word.trim().length() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isEmpty(List<String> words) {
        if (words != null && !words.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isLongEnough(int number) {
        if (number > 0) {
            return false;
        } else {
            return true;
        }
    }
}
