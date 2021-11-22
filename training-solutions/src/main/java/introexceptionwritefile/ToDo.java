package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
        private List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDo toDo = new ToDo();
        System.out.println("Kérem adjon meg egy teendőt a listára" +
                "\nHa végzett akkor adja meg az 'x'-et");
        do{
        }while (toDo.addToList(scanner.nextLine()));
        toDo.writeFile();
    }

    public boolean addToList(String toDoString){
        if(!(toDoString.trim().equals("x"))){
            toDoList.add(toDoString);
            return true;
        }else{
            return false;
        }
    }

    public void writeFile(){
        try {
            Files.write(Paths.get("src/main/resources/todos.txt"), toDoList);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
