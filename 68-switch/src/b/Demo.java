package b;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Demo {

    public static void main(String[] args) {
        // 0-6
        Day day = Day.values()[(int) (Math.random() * 6)];
        switch (day) {
            case MONDAY:
                System.out.println("The random day is Monday");
                break;
            case WEDNESDAY:
                System.out.println("The random day is Wednesday");
                break;
            case FRIDAY:
                System.out.println("The random day is Friday");
        }

        System.out.println(
                switch (day) {
                    default:
                        yield "The random day is some other day";
                    case MONDAY:
                        lbl:
                        if (true){
                            break lbl;
                        }
                        yield "The random day is Monday";
                    case WEDNESDAY:
                        yield "The random day is Wednesday";
                    case FRIDAY:
                        yield "The random day is Friday";
                }
        );
    }
}