package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> list, int minHeight){
        int count = 0;
        for(Integer i: list){
            if(i > minHeight){
                count++;
            }
        }
        return count;
    }
}
