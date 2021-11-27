package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendriveList){
        int step = 0;
//        Pendrive pendrive = pendriveList.get(0);
        for(int i = 1; i < pendriveList.size();i++){
            if(pendriveList.get(i - 1).comparePricePerCapacity(pendriveList.get(i)) == 1){
                step = i;
            }
        }
        return pendriveList.get(step);
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList){
        int step = 0;
        for(int i = 0; i < pendriveList.size();i++){
            if(pendriveList.get(i).isCheaperThan(pendriveList.get(step))){
                step = i;
            }
        }
        return pendriveList.get(step);
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity){
        for(int i = 1; i < pendriveList.size();i++){
            if(pendriveList.get(i).getCapacity() == capacity){
                pendriveList.get(i).risePrice(percent);
            }
        }
    }
}
