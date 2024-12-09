package h;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        final var SCANNER = new Scanner(System.in);
        System.out.print("Enter address: ");
        String address = SCANNER.nextLine();
        System.out.println(switch (address){
            case "GALLE" -> "Entered address" +  " is GALLE";
            case "MATARA" ->  {
                String result = "";
                result = "Entered address";
                result += " ";
                result += "Matara";
                yield result;
            }
            default -> throw new IllegalStateException("Invalid address");
        });
    }
}
