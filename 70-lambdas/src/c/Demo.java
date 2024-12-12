package c;

public class Demo {
    int x;
    static int y;

    void myMethod(){
        new Customer(1, "Nuwan"){
          void abc(){
              System.out.println(x);
              System.out.println(y);
          }
        };
    }

    public static void main(String[] args) {
        int a = 10;
        new Customer(1, "Kasun"){
            void print(){
                System.out.println("I am Kasun");
                System.out.println(y);
                System.out.println(a);
            }
            void abc(){
                System.out.println("ABC()");
            }
        }.abc();
        //a = 20;

//        c.print();
    }
}
class Customer{
    int id;
    String name;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void print(){
        System.out.printf("id=%s, name=%s %n", id , name);
    }
}

// @FunctionalInterface
interface MyInterface1{}
@FunctionalInterface
interface MyInterface2{
    void print();
}
// @FunctionalInterface
interface MyInterface3{
    void print();
    void abc();
}
@FunctionalInterface
interface MyInterface4{
    void print();
    default void execute(){}
}
// @FunctionalInterface
interface MyInterface5{
    static void print(){}
}