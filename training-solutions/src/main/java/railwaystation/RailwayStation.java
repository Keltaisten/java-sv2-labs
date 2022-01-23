package railwaystation;

import java.util.*;

public class RailwayStation {
    private List<Train> trains = new ArrayList<>();

    public void addTrain(Train train) {
        if (trains.size() < 10) {
            trains.add(train);
        } else {
            throw new IllegalArgumentException("Too much trains!");
        }
    }

    public Train getLongestTrain() {
        Optional<Train> temp = trains.stream()
                .max(new Comparator<Train>() {
                    @Override
                    public int compare(Train o1, Train o2) {
                        return o1.getTotalLength() - o2.getTotalLength();
                    }
                });
        return temp.orElseThrow(
                () ->
                        new IllegalArgumentException("nothing"))
                ;
//        return temp.get();
    }

    public Train getLongestTrain3() {
        if (trains.size() == 0) {
            throw new IllegalArgumentException("No trains in the station.");
        }
        Train result = trains.get(0);
        for (Train t : trains) {
            if (t.getTotalLength() > result.getTotalLength()) {
                result = t;
            }
        }
        return result;
    }

    public int getHowManyTrainsHaveName(){
        return (int) trains.stream()
                .map(Train::getName)
                .filter(Objects::nonNull)
                .count();
    }

    public List<Train> getTrainsWithPassengersMoreThan(int number){
        return trains.stream()
                .filter(train -> train.calculateTravellingPeople() > number)
                .toList();
    }

    public List<Train> getTrains() {
        return trains;
    }
}
