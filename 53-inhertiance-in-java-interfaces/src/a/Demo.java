package a;

public class Demo {
    public static void main(String[] args) {
        new MyClass();
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
