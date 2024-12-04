package a;

public class Demo {
    final static int MONDAY = 1;
    final static int TUESDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;

    public static void printDay(int day) {
        if (day <= 0 || day > 7) throw new IllegalArgumentException("Invalid day");
        if (day == MONDAY) System.out.println("Monday");
        else if (day == TUESDAY) System.out.println("Tuesday");
        else if (day == WEDNESDAY) System.out.println("Wednesday");
        else if (day == THURSDAY) System.out.println("Thursday");
        else if (day == FRIDAY) System.out.println("Friday");
        else if (day == SATURDAY | day == SUNDAY) System.out.println("Weekend day");
    }

    public static void main(String[] args) {
        printDay(MONDAY);
        printDay(SATURDAY);
        //printDay("ijse");  // Compiler does not allow this line of code because of the type-safety
        printDay(0);
        printDay(-10);
        printDay(100);
    }

}
