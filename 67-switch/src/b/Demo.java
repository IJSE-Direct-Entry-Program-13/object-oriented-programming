package b;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter a day (1-7): ");
        int day = SCANNER.nextInt();

        // Fall-through switch statement
        // Switch Block via Statement Group
        switch (day) {
            case 1: System.out.println("Monday");
            case 2: System.out.println("Tuesday");
            case 3: System.out.println("Wednesday");
            case 4: System.out.println("Thursday");
            case 5: System.out.println("Friday");
            case 6: System.out.println("Saturday");
            case 7: System.out.println("Sunday");
            default: System.out.println("Invalid day");
        }
    }
}
