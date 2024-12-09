package e;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter address: ");
        String address = SCANNER.nextLine();
        final String str = "LE";
        switch (address.toUpperCase()){
            case "G" + "AL" + str:
                System.out.println("C001 - Kasun - Galle");
                System.out.println("C003 - Nuwan - Galle");
                System.out.println("C004 - Ruwan - Galle");
                break;
            case 10 + 15 + "":
                System.out.println("C002 - Upul - Matara");
                System.out.println("C005 - Dasun - Matara");
                break;
            default:
                System.out.println("C006 - Tharanga - Moratuwa");
        }
    }
}
