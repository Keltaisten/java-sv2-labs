package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> listOfMountaionsHeight){
       int max = listOfMountaionsHeight.get(0);
       for(int i: listOfMountaionsHeight){
           if(i > max){
               max = i;
           }
       }
       return max;
    }
}
