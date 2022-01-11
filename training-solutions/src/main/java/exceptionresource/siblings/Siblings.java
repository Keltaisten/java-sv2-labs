package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {
    List<String> getFullNames(String lastName, Path path) {
        List<String> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.add(lastName + " " + line);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can't read file!", ioe);
        }
        return result;
    }
}
