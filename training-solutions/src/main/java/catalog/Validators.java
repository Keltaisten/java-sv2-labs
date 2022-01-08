package catalog;

import java.util.List;

public class Validators {
    public static boolean isBlank(String word) {
        if (word != null && word.length() != 0) {
            return true;
        } else {
            throw new IllegalArgumentException("Empty title");
        }
    }

    public static boolean isEmpty(List<String> words) {
        if (words != null && !words.isEmpty()) {
            return true;
        } else {
            throw new IllegalArgumentException("No members in the list");
        }
    }

    public static boolean isLongEnough(int number) {
        if (number > 0) {
            return true;
        } else {
            throw new IllegalArgumentException("The song length must be longer than 0");
        }
    }
}
