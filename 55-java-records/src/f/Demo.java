package f;

import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kasun");
        Student s2 = new Student(1, "Kasun");
        System.out.println(s1.hashCode() + " - " + s1.toString()) ;
        System.out.println(s2.hashCode() + " - "  +s2.toString());
    }
}

class Student{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
