package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {
//    public static void main(String[] args) {
////        List<String> names = new ArrayList<>();
//        List<String> names = new PaulStreetBoys().readTheNames();
////        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
////        names = paulStreetBoys.readTheNames();
////        paulStreetBoys.toLowerNemecsek(names);
//        new PaulStreetBoys().toLowerNemecsek(names);
//        System.out.println(names);
//    }
//
//    private void toLowerNemecsek(List<String> names) {
//        for (String s: names){
//            if(s.equals("Nemecsek Ernő")){
//                s.toLowerCase();
//            }
//        }
//    }
//
//    public List<String> readTheNames(){
//        try {
//            return  Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
//        }catch (IOException ioe){
//            throw new IllegalStateException("File not found", ioe);
//        }
//    }

    public static void main(String[] args) {
        List<String> nameList = new PaulStreetBoys().readTheNames();
        new PaulStreetBoys().toLowerNemecsek(nameList);
        System.out.println(nameList);
    }

    private void toLowerNemecsek(List<String> nameList) {
        for(String s: nameList){
            if(s.equals("Nemecsek Ernő")){
                s = s.toLowerCase();
            }
        }
    }

    private List<String> readTheNames() {
        try {
            return Files.readAllLines(Paths.get("palutcaifiuk.txt"));
        }catch (IOException ioe){
            throw new IllegalStateException("Not found", ioe);
        }

    }
}
