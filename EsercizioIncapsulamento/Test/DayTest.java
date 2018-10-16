import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest
{
    Day day;

    @BeforeEach
    public void setUp()
    {
        day = new Day(9, 10, 2018);
    }

    //UTILITY

    @Test
    public void addDaysTest()
    {
        Day expected = new Day(19, 10,2018);

        Day result = day.addDays(10);

        assertEquals(expected, result);
    }

    @Test
    public void daysUntilNextYearTest()
    {
        assertEquals(day.daysUntilNextYear(), 83);
    }

    @Test
    public void daysBetweenTest()
    {
        Day end = new Day(25, 10, 2018);

        assertEquals(day.daysBetween(end), 16);
    }


    @Test
    public void getDateTest()
    {
        assertEquals(day.getDate(), "9-10-2018");
    }

    //STATIC
    @Test
    public void nowTest()
    {
        Day today = Day.now();

        LocalDate now = LocalDate.now();

        Day expected = new Day(now.getDayOfMonth(), now.getMonthValue(), now.getYear());

        assertEquals(today, expected);
    }
}
