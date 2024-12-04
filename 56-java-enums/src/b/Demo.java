package b;

public class Demo {

    public static void printDay(Day day) {
        //if (day <= 0 || day > 7) throw new IllegalArgumentException("Invalid day");
        if (day == Day.MONDAY) System.out.println("Monday");
        else if (day == Day.TUESDAY) System.out.println("Tuesday");
        else if (day == Day.WEDNESDAY) System.out.println("Wednesday");
        else if (day == Day.THURSDAY) System.out.println("Thursday");
        else if (day == Day.FRIDAY) System.out.println("Friday");
        else if (day == Day.SATURDAY | day == Day.SUNDAY) System.out.println("Weekend day");
    }
    public static void main(String[] args) {
        printDay(Day.MONDAY);
        //printDay("ijse");
    }
}
//final class Day {
//    public static final Day MONDAY = new Day();
//    public static final Day TUESDAY = new Day();
//    public static final Day WEDNESDAY = new Day();
//    public static final Day THURSDAY = new Day();
//    public static final Day FRIDAY = new Day();
//    public static final Day SATURDAY = new Day();
//    public static final Day SUNDAY = new Day();
//    private Day(){}
//}
enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
