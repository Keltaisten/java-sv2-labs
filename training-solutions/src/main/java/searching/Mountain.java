package searching;

import java.util.Arrays;
import java.util.Comparator;

public class Mountain {
    Pike[] pikes = new Pike[4];

    public void addPike(){
        pikes[0] = new Pike("Alpok",1520);
        pikes[1] = new Pike("Kékestető",1114);
        pikes[2] = new Pike("Machu Pichu",4536);
        pikes[3] = new Pike("Mount Everest",8848);
    }

    public static void main(String[] args) {

    }

    public boolean searchPike(Pike pike){
        return 0 <= Arrays.binarySearch(pikes, pike, new Comparator<Pike>() {
            @Override
            public int compare(Pike o1, Pike o2) {
                return o1.getNameOfPike().compareTo(o2.getNameOfPike());
            }
        });
//        System.out.println(Arrays.binarySearch(pikes, pike));
//        return 0 <= Arrays.binarySearch(pikes, pike);
    }
}
