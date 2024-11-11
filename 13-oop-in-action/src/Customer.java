public class Customer {
    String id;
    String name;

    static String country;

    public Customer(int lastId, String name) {
        this.id = generateNewId(lastId);
        this.name = name;
    }

    private String generateNewId(int lastId){
        int newId = lastId + 1;
        return "C%03d".formatted(newId);
    }

    {
        String output = id  + " " + name;
        System.out.println(output);
    }
}
