public class Demo2 {
    public static void main(String[] args) {
        SuperClass clz = new SubClass();
        System.out.println("value=" + clz.value);
        System.out.println("number=" + clz.number);
        System.out.println("age=" + clz.age);
        System.out.println("marks=" + clz.marks);
        clz.print();
    }
}

class SuperClass {
    static int value = 10;
    int number = 10;
    static int age = 10;
    int marks = 10;
    void print(){
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass {
    static int value = 20;
    static int number = 20;
    int age = 20;
    static int marks = 20;
    void print() {
        System.out.println("Sub Class");
    }
}
