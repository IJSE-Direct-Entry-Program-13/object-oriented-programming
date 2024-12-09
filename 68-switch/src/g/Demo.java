package g;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter address: ");
        String address = SCANNER.nextLine();
        switch(address.toUpperCase()){
            // case "GALLE" -> if (true) System.out.println("Entered address is Galle");
            case "GALLE" -> System.out.println("C001 - Kasun - Galle");
            case "MATARA" -> {
                System.out.println("C002 - Nuwan - Matara");
                for (int i = 0; i < 2; i++)
                if (true) System.out.println("C002 - Nuwan - Matara");
                System.out.println("C002 - Nuwan - Matara");
                System.out.println("C002 - Nuwan - Matara");
            }
            default -> throw new IllegalStateException("Invalid address");
        }
    }
}
