public class Main
{
    public static void main(String[] args)
    {
        Day today = Day.now();

        System.out.println(today.getDate());

        System.out.println("Days until end of year: "+today.daysUntilNextYear());

        System.out.println("Days from today to 25/10: "+today.daysBetween(new Day(25, 10, 2018)));

        Day todayPlus10 = today.addDays(10);
        System.out.println(todayPlus10.getDate());


    }
}
