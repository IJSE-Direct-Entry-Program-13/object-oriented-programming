package b;

public class Demo {

    public static void main(String[] args) {
        Object ref = new Object();
        System.out.println(ref);
        Object ref2 = new Object(){
            // Demo$1
        };
        System.out.println(ref2);
        Object ref3 = new Object(){
            // Demo$2
        };
        System.out.println(ref3);

        Student s1 = new Student(1, "Kasun", "011-1234567"){
            void print(){
                System.out.println("I am a special student");
            }
        };
        Student s2 = new Student(2, "Nuwan", "022-1234567");
        s1.print();
        s2.print();

        new Employee(1, "Kasun"){

        };

        new MyInterface(){
            @Override
            public void print() {

            }
        };
    }
}
class Student{
    int id;
    String name;
    String contact;
    Student(int id, String name, String contact){
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    void print(){
        System.out.printf("id=%s, name=%s, contact=%s %n", id, name, contact);
    }
}
abstract class Employee{
    Employee(int id, String name){}
}
interface MyInterface{
    void print();
}


