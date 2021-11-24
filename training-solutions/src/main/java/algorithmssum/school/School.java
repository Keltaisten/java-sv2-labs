package algorithmssum.school;

import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts){
        int sum = 0;
        for(int i: headcounts){
            sum += i;
        }
        return sum;
    }
}
