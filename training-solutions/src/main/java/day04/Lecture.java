package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Block> blocks = new ArrayList<>();

    public void readFile(Path path){
    List<String> dataWithString = new ArrayList<>();
        try  {
            dataWithString = Files.readAllLines(path);
        }
        catch (IOException ioe){
            throw new IllegalArgumentException("Can't read file!");
        }
        for(int i = 0; i < dataWithString.size(); i += 4){
            Block block = new Block(dataWithString.get(i),dataWithString.get(i + 1),dataWithString.get(i + 2),
                    Integer.parseInt(dataWithString.get(i + 3)));
            blocks.add(block);
        }
    }

    public int howManyLesson(String name){
        int result = 0;
        for(Block b : blocks){
            if(b.getNameOfTeacher().equals(name)){
                result += b.getHowManyTimesTeach();
            }
        }
        return result;
    }
}
