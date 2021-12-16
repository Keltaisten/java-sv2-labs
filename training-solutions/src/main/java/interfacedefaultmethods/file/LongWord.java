package interfacedefaultmethods.file;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LongWord implements FileOperations{
    private List<String> reads = new ArrayList<>();

    @Override
    public String getLongWord() {
        StringBuilder longWord = new StringBuilder().append(reads.get(0));
        boolean firstLoop = true;
        for(String s: reads){
            if(firstLoop){
                firstLoop = false;
            }else{
                longWord.append(s.charAt(s.length() - 1));
            }
        }
        return String.valueOf(longWord);
    }

//    @Override
//    public List<String> readFromFile(Path path) {
//        return FileOperations.super.readFromFile(path);
//    }

    public void setReads(Path path){
        reads = readFromFile(path);
    }
}
