package c;

public class Demo {
    public static void main(String[] args) {
        SubClass clz = new SubClass();
        // clz.print();
    }
}
interface MyInterface1{
    int VALUE = 10;
    static void print(){
        System.out.println("MyInterface1");
    }
}
interface MyInterface2{
    static void print(){
        System.out.println("MyInterface2");
    }
}
class SuperClass{
    int VALUE = 20;
//    static void print(){
//        System.out.println("Super Class");
//    }
}
class SubClass extends SuperClass implements MyInterface1, MyInterface2{

}
