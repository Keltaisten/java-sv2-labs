package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatedSum {
    public List<Double> sum(String floatingNumbers){
        double positiveNumbers =  0;
        double negativeNumbers =  0;
        String modifiedString = floatingNumbers.replaceAll(",",".");
        String[] doubleNumbersArray = modifiedString.split(";");
        for(String s: doubleNumbersArray){
            double doubleNumber = Double.parseDouble(s);
            if(doubleNumber > 0){
                positiveNumbers += doubleNumber;
            }else{
                negativeNumbers += doubleNumber;
            }
        }
        return Arrays.asList(positiveNumbers, negativeNumbers);
    }

    public String readFile(Path path){
        List<String> numberList;
        try {
            numberList = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
        StringBuilder sbForNumbers = new StringBuilder();
        for(String s: numberList){
            sbForNumbers.append(s);
        }
        return String.valueOf(sbForNumbers);
    }
}
