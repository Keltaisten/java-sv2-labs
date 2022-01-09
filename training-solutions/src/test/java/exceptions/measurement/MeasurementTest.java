package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    @Test
    void readFromFile() {
    }

    @Test
    void validate() {
        Measurement measurement = new Measurement();
        List<String> readedData = measurement.readFromFile(Paths.get("src/main/resources/measurementdata.csv"));
        assertEquals(8,measurement.validate(readedData).size());
    }
}