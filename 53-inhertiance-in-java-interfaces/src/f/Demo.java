package f;

public class Demo {
}

interface Calendar {
    int MONDAY = 1;
    int TUESDAY = 2;
    int WEDNESDAY = 3;
    int THURSDAY = 4;
    int FRIDAY = 5;
    int SATURDAY = 6;
    int SUNDAY = 7;

    void addDay(int day);
    void removeDay(int day);
    void addEvent(int day, String event);
}

class GoogleCalendar implements Calendar {

    @Override
    public void addDay(int day) {
        if (day == MONDAY) {

        }else if (day == TUESDAY) {

        }
    }

    @Override
    public void removeDay(int day) {

    }

    @Override
    public void addEvent(int day, String event) {

    }
}