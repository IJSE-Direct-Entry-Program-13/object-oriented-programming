package data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Demo {

    public static void main(String[] args) {
        Customer kasun = new Customer("c005", "Kasun");
        System.out.println(kasun.getId());
        // System.out.println(kasun.id);
    }
}

class Customer {
    // By making instance variables private, we encapsulate state/data,
    // This is what we call "Data/State Encapsulation"
    // private int id;
    private String name;

    public Customer(String id, String name) {
        setId(id);
        setName(name);
    }

    // By exposing these getters/setters which acts against the original internal state,
    // We abstract the original data/state, this is what we call "Data/State Abstraction"
    public String getId(){
        //return "C%03d".formatted(id);
        File file = new File("dep.txt");
        try {
            return new String(Files.readAllBytes(file.toPath())).toUpperCase();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // "c100" -> "C100" -> "100" -> 100
    public void setId(String id){
        if (!id.toUpperCase().matches("C\\d{3}")) throw new IllegalStateException("Invalid id");
//        String upperCaseId = id.toUpperCase();
//        String numberPart = upperCaseId.replace("C", "");
//        int numberId = Integer.parseInt(numberPart);
        //this.id = Integer.parseInt(id.toUpperCase().replace("C", ""));
        File file = new File("dep.txt");
        try {
            file.createNewFile();
            Files.write(file.toPath(), id.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
