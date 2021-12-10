package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> stormTroopers = new ArrayList<>();

    public void addTrooper(Trooper trooper){
        stormTroopers.add(trooper);
    }

    public void moveClosestTrooper(Position target){
        if(target == null){
            throw new IllegalArgumentException("Target is null");
        }
        else{
//            findClosestTrooper(target).changePosition(target);
            moveTrooper(findClosestTrooper(target), target);
        }
    }

    private Trooper findClosestTrooper(Position target){
        Trooper minimumDistanceTrooper = stormTroopers.get(0);
        for(Trooper t: stormTroopers){
            if(t.distanceFrom(target) < minimumDistanceTrooper.distanceFrom(target)){
                minimumDistanceTrooper = t;
            }
        }
        return minimumDistanceTrooper;
    }

    public void moveTrooperByName(String name, Position target){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name is empty or null");
        }else if(target == null){
            throw new IllegalArgumentException("Target is null");
        }
        else{
//            findTrooperByName(name).changePosition(target);
            moveTrooper(findTrooperByName(name),target);
        }
    }

    private Trooper findTrooperByName(String name){
        Trooper trooper = null;
        for(Trooper t: stormTroopers){
            if(t.getName().equals(name)){
                trooper = t;
            }
        }
        return trooper;
    }

    private void moveTrooper(Trooper trooper, Position target){
        trooper.changePosition(target);
    }

    public List<Trooper> getStormTroopers() {
        return stormTroopers;
    }
}
