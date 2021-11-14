package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void printNames() {
        for(MeetingRoom m: meetingRooms){
            System.out.println(m.getName());
        }
    }

    public void printNamesReverse() {
        for(int i = (meetingRooms.size() -1); i >= 0;i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for(int i = 0; i < meetingRooms.size();i +=2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for(MeetingRoom m: meetingRooms){
            System.out.println(m.toString() + ", Area:" + m.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name) {
        for(MeetingRoom m: meetingRooms){
            if(m.getName().equals(name)){
            System.out.println("MeetingRoom " + "Length: " + m.getLength() +
                    ", Width: " + m.getWidth() + ", Area: " + m.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for(MeetingRoom m: meetingRooms){
            if(m.getName().contains(part)){
                System.out.println("MeetingRoom " + "Length: " + m.getLength() +
                        ", Width: " + m.getWidth() + ", Area: " + m.getArea());
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for(MeetingRoom m: meetingRooms){
            if(m.getArea() > area){
                System.out.println(m.toString() + ", Area: " + m.getArea());
            }
        }
    }

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }
}
