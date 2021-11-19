package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Operations {
    public List<String> readFile() throws IOException {
        List<String> data = new ArrayList<>();
        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
    }

    public String getDailySchedule(List<String> under){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(LocalDate.now() + ",");
        for(String s: under){
            if(s.charAt(0) == '2'){
                stringBuilder.append(" " + s);
            }
        }
        return String.valueOf(stringBuilder);
    }
}
