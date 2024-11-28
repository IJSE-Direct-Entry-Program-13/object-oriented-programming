package a;

public class Demo {
    public static void main(String[] args) {
        MyInterface1 obj = new MyClass();
//        System.out.println(MyInterface1.class instanceof Object);
//        System.out.println(MyInterface2.class instanceof Object);

    }
}

interface MyInterface1{
    void printA();
}
interface MyInterface2{
    void printB();
}
class MySuperClass {

}
class MyClass extends MySuperClass implements MyInterface1, MyInterface2{
    public void printA(){
        System.out.println("MySuperClass printA()");
    }
    public void printB(){
        System.out.println("MySuperClass printB()");
    }
}
