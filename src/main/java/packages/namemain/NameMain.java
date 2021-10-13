package packages.namemain;

import packages.firstname.Firstname;
import packages.lastname.Lastname;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Mr.");
        Firstname firstname = new Firstname("Adam");
        Lastname lastname = new Lastname("Kiss");

        System.out.println(prefix.getPre() + " " + firstname.getFirst() + " " + lastname.getLast());
    }
}
