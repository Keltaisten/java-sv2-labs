package compositionlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capsules {
    private List<String> cupHolder = new ArrayList<>();

    public void addLast(String cup){
        cupHolder.add(cup);
    }

    public void addFirst(String cup){
        cupHolder.add(0,cup);
    }

    public void removeFirst(){
        cupHolder.remove(0);
    }

    public void removeLast(){
        cupHolder.remove(cupHolder.get(cupHolder.size()-1));
    }

    public List<String> getColors(){
        return cupHolder;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("ot");
        capsules.addFirst("negy");
        capsules.addLast("harom");
        capsules.addFirst("ketto");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
