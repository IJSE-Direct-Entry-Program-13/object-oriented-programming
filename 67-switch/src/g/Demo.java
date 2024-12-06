package g;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = SCANNER.nextLine();
        int days = 0;
        if (month.equalsIgnoreCase("January") || (days += 31) < 0) {
            System.out.println("[January - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("February")|| (days += 28) < 0) {
            System.out.println("[February - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("March")|| (days += 31) < 0) {
            System.out.println("[March - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("April")|| (days += 30) < 0) {
            System.out.println("[April - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("May")|| (days += 31) < 0) {
            System.out.println("[May - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("June")|| (days += 30) < 0) {
            System.out.println("[June - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("July")|| (days += 31) < 0) {
            System.out.println("[July - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("August")|| (days += 31) < 0) {
            System.out.println("[August - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("September")|| (days += 30) < 0) {
            System.out.println("[September - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("October")|| (days += 31) < 0) {
            System.out.println("[October - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("November")|| (days += 30) < 0) {
            System.out.println("[November - December]: " + (365 - days));
        } else if (month.equalsIgnoreCase("December")|| (days += 31) < 0) {
            System.out.println("[December - December]: " + (365 - days));
        } else {
            System.out.println("Invalid month");
        }
    }
}

