package i;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = SCANNER.nextLine();
        int days = 0;
        System.out.printf("[%s - December]: %d %n", month, switch (month){
            case "January": days += 31;
            case "February": days += 28;
            case "March": days += 31;
            case "April": days += 30;
            case "May": days += 31;
            case "June": days += 30;
            case "July": days += 31;
            case "August": days += 31;
            case "September": days += 30;
            case "October": days += 31;
            case "November": days += 30;
            case "December": yield days += 31;
            default: yield -1;
        });
    }
}
