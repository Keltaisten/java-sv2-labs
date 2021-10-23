package finalmodifier;

public class Gentleman {
    final static String MESSAGE_PREFIX = "Hello there!";

    public String sayHello(String name){
        return MESSAGE_PREFIX + " " + name;
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        System.out.println(gentleman.sayHello("General Kenobi"));
    }
}
