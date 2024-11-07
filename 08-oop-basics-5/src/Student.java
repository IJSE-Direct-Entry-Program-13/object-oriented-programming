import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    String nic;
    String name;
    LocalDate dateOfBirth;
    ArrayList<Course> courses;

    public Student(String nic, String name, LocalDate dateOfBirth, ArrayList<Course> courses) {
        this.nic = nic;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
    }
}
