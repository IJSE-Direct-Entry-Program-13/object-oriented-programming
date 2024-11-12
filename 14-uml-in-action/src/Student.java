public class Student {
    private transient String id = generateId();
    private String name;
    private String contact;
    private static int LAST_ID;

    public Student(String name, String contact) {
        this.name = name;
        this.contact = contact;
        LAST_ID++;
    }

    protected static synchronized String generateId() {
        return "S%03d".formatted(LAST_ID + 1);
    }

    public String getId() { return this.id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public static void main(String[] args) {
        Student s1  = new Student("Kasun", "011-1234567");
        Student s2  = new Student("Nuwan", "022-1234567");
        System.out.printf("id=%s, name=%s, contact=%s %n", s1.getId(), s1.getName(), s1.getContact());
        System.out.printf("id=%s, name=%s, contact=%s %n", s2.getId(), s2.getName(), s2.getContact());
    }
}
