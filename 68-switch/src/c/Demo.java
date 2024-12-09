package c;

public class Demo {
    public static void main(String[] args) {
        SUNDAY:VALUE1:VALUE2:
        System.out.println("Hello");
        MONDAY:
        System.out.println("I am a new statement");
        TUESDAY:
        System.out.println("Hi");
        WEDNESDAY:
        System.out.println("I am a new statement too");
        THURSDAY:
        System.out.println("About to exit");

        switch (Day.values()[(int)(6 * Math.random())]){
            default:
                System.out.println("Just another day ");
            case SUNDAY:
                System.out.println("Sunday");
            TUESDAY:
                System.out.println("Tuesday");
            case FRIDAY:
                System.out.println("Friday");
            SATURDAY:
                System.out.println("Saturday");
        }
    }
}

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY, SATURDAY, SUNDAY
}