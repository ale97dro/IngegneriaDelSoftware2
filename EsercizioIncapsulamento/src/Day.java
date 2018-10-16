import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * This class represent a day.
 * It is composed by day, month and year.
 */
public class Day
{
    /**
     * This attribute saves the information about the day
     */
    private final LocalDate date;

    /**
     * Create a new Day
     * @param day day of month
     * @param month number of month
     * @param year year
     */
    public Day(int day, int month, int year)
    {
        this.date = LocalDate.of(year, month, day);
    }

    //GETTER METHOD

    /**
     * Get value of day of the month
     * @return day value
     */
    public int getDay()
    {
        return date.getDayOfMonth();
    }

    /**
     * Get value of month
     * @return month value
     */
    public int getMonth()
    {
        return date.getMonthValue();
    }

    /**
     * Get value of year
     * @return Year value
     */
    public int getYear()
    {
        return date.getYear();
    }

    //UTILITY METHOD

    /**
     * Add days to this day
     * @param days Days to add
     * @return New day that is the result of the sum
     */
    public Day addDays(int days)
    {
        LocalDate temp = date.plusDays(days);
        return new Day(temp.getDayOfMonth(), temp.getMonthValue(), temp.getYear());
    }

    /**
     * Number of the days until next year
     * @return Number of days
     */
    public int daysUntilNextYear()
    {
        return daysBetween(new Day(31, 12, LocalDate.now().getYear()));
    }

    /**
     * Days between two dates
     * @param day Day to compare
     * @return Number of days
     */
    public int daysBetween(Day day)
    {
        LocalDate end = LocalDate.of(day.getYear(), day.getMonth(), day.getDay());

        return (int)date.until(end, ChronoUnit.DAYS);
    }

    //PRESENTATION METHOD

    /**
     * Get a string representation of this day in the format 'dd-mm-yyyy'
     * @return Day's date
     */
    public String getDate()
    {
        StringBuilder str = new StringBuilder();

        str.append(date.getDayOfMonth());
        str.append('-');
        str.append(date.getMonthValue());
        str.append('-');
        str.append(date.getYear());

        return str.toString();
    }

    //STATIC METHOD

    /**
     * Return current day
     * @return Current day
     */
    public static Day now()
    {
        LocalDate now = LocalDate.now();

        return new Day(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
    }

    //OVERRIDED METHOD

    /**
     * This compare two day
     * @param o Other day
     * @return Result of the comparision
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(date, day.date);
    }

    /**
     * This generate an hash code for the current day
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
