package f;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter a day (1-7): ");
        int day = SCANNER.nextInt();
        // Switch Expression
        // Switch Block via Switch Rules
        System.out.println("You entered: " +
                (switch (day){
                    case 1 -> "Monday";
                    case 2 -> "Tuesday";
                    case 3 -> "Wednesday";
                    case 4 -> "Thursday";
                    case 5 -> "Friday";
                    case 6 -> "Saturday";
                    case 7 -> "Sunday";
                    default -> "Invalid Day";
                }));
    }
}
