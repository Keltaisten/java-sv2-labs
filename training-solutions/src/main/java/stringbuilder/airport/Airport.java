package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    private void addFlight(Flight flight){
        flights.add(flight);
    }

    public StringBuilder getDeletedFlights(){
        StringBuilder strB = new StringBuilder();
        strB.append("Törölt járatok:");
        for(Flight i: flights){
            if(i.getStatus() == Status.DELETED){
                strB.append("\n");
                strB.append(i.getFlightNumber());
            }
        }
        return strB;
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight flight1 = new Flight("BZ5674",Status.ACTIVE);
        Flight flight2 = new Flight("ET5674",Status.DELETED);
        Flight flight3 = new Flight("VG5674",Status.ACTIVE);
        Flight flight4 = new Flight("PK5674",Status.DELETED);
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);

        System.out.println(airport.getDeletedFlights().toString());
    }


}
