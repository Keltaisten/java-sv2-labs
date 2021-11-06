package controliteration.day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {
    @Test
    public void createTest(){
        Day day = new Day();
        day.addHour(new Hour(18));
        day.setDayPeriod();

        assertEquals(DayPeriod.DAYTIME,day.getHoursOfDay().get(0).getPeriod());
    }
}
