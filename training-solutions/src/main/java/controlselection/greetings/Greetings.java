package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {
    public String saySomething(LocalTime time){
        String say = "";
        int minutes = 60;
        int transform = Integer.parseInt(time.toString().substring(0,2))*minutes+Integer.parseInt(time.toString().substring(3));
        if(transform<=5*minutes || transform> 20*minutes){
            say = "jó éjszakát";
        }else if(transform>5*minutes && transform<= 9*minutes){
            say = "jó reggelt";
        }else if(transform>9*minutes && transform<= (18*minutes+ 30)){
            say = "jó napot";
        }else if(transform>(18*minutes+30) && transform<= 20*minutes){
            say = "jó estét";
        }

        return say;
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.saySomething(LocalTime.of(9,2)));
        System.out.println(greetings.saySomething(LocalTime.of(19,30)));
    }
}
