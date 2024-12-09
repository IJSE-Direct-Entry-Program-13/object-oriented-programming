package f;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter address: ");
        String address = SCANNER.nextLine();
        switch(address.toUpperCase()){
            case "GA" + "LLE" -> System.out.println("Entered address is: Galle");
            case "MATARA" -> System.out.println("Entered address is: Matara");
            default -> System.out.println("Some other address");
        }

        System.out.println(switch (address.toUpperCase()){
                    case "GA" + "LLE" -> "Entered address is: Galle";
                    case "MATARA" -> "Entered address is: Matara";
                    default -> "Some other address";
        });
    }
}
