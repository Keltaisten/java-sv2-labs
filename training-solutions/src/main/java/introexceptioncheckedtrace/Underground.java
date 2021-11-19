package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {
    public static void main(String[] args) {
        Operations operations = new Operations();
        List<String> stringNumber = new ArrayList<>();
        try {
            stringNumber = operations.readFile();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println(operations.getDailySchedule(stringNumber));
    }
}
