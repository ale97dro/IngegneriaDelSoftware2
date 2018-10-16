import org.omg.CORBA.LongLongSeqHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.*;

public class Day
{
    private final int day;
    private final int month;
    private final int year;

    public Day(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //GETTER

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    //UTILITY

    public Day addDays(int days)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, days);

        LocalDate ldt = c.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return new Day(ldt.getDayOfMonth(), ldt.getMonthValue(), ldt.getYear());
    }

    public int daysUntilNextYear()
    {
        return daysBetween(new Day(31, 12, LocalDate.now().getYear()));
    }

    public int daysBetween(Day day)
    {
        LocalDate start = LocalDate.of(year, month, this.day);
        LocalDate end = LocalDate.of(day.getYear(), day.getMonth(), day.getDay());

        return (int)start.until(end, ChronoUnit.DAYS);
    }

    //"PRINT"

    public String getDate()
    {
        StringBuilder str = new StringBuilder();

        str.append(day);
        str.append('-');
        str.append(month);
        str.append('-');
        str.append(year);

        return str.toString();
    }

    //STATIC

    public static Day now()
    {
        LocalDate now = LocalDate.now();

        return new Day(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day1 = (Day) o;
        return day == day1.day &&
                month == day1.month &&
                year == day1.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
