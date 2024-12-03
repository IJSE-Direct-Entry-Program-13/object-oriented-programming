package b;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "Kasun", "Galle");
        Student s1Clone = s1.clone();
        System.out.println(s1 == s1Clone);
        System.out.println("=========");
        System.out.println(s1.id == s1Clone.id);
        System.out.println(s1.name == s1Clone.name);
        System.out.println(s1.address == s1Clone.address);
    }
}
class Student implements Cloneable {
    int id;
    String name;
    String address;
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}