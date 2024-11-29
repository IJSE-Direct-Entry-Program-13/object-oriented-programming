package g;

public class Demo {
    public static void main(String[] args) {
        MySuperInterface ref = new MyClass();
        ref.print();
    }
}
interface MySuperInterface{
    void print();
}
interface MyInterface1 extends MySuperInterface{
    void print();
}
interface MyInterface2{
    void print();
}
class SuperClass {
    public void print(){
        System.out.println("SuperClass: print()");
    }
}
class MyClass extends SuperClass implements MyInterface1, MyInterface2{

}