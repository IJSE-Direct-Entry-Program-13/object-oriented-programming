package e;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter a day (1-7): ");
        int day = SCANNER.nextInt();
        // Switch Expression
        // Switch Block via Statement Group
        System.out.println("You entered: " +
                (switch (day){
                    case 1: yield "Monday";
                    case 2: yield "Tuesday";
                    case 3: yield "Wednesday";
                    case 4: yield "Thursday";
                    case 5: yield "Friday";
                    case 6: yield "Saturday";
                    case 7: yield "Sunday";
                    default: yield "Invalid Day";
                }));
    }
}
