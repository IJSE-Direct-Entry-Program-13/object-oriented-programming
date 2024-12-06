package d;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter a day (1-7): ");
        int day = SCANNER.nextInt();
        System.out.println("You entered: " +
                (day == 1 ? "Monday" :
                day == 2 ? "Tuesday" :
                day == 3 ? "Wednesday" :
                day == 4 ? "Thursday" :
                day == 5 ? "Friday":
                day == 6 ? "Saturday" :
                day == 7 ? "Sunday":
                "Invalid Day"));
    }
}
