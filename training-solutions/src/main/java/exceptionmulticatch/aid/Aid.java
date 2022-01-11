package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path){
        List<String> result = new ArrayList<>();
        List<String> tempReadedRows = new ArrayList<>();
        try {
            tempReadedRows = Files.readAllLines(path);
        }
        catch (IOException | NullPointerException ioe){
            throw new IllegalArgumentException("Can't read file!");
        }
        for(String s: tempReadedRows){
            try {
                String[] splittedRow = s.split(": ");
                int amountForTown = Integer.parseInt(splittedRow[1]) * amount;
                String completeNewRow = splittedRow[0] + ": " + amountForTown;
                result.add(completeNewRow);
            }
            catch (IndexOutOfBoundsException | NumberFormatException e){
                throw new IllegalArgumentException("Invalid line " + s, e);
            }
        }
        return result;
    }
}
