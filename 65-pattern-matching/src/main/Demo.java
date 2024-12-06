package main;

public class Demo {

    public static void main(String[] args) {
        Super ref = Math.random() > 0.5 ? new Sub1(): new Sub2();
        ref.print();
        if (ref instanceof Sub1) {
            Sub1 sub1Ref = (Sub1) ref;
            sub1Ref.printA();
        }else if (ref instanceof Sub2) {
            Sub2 sub2Ref = (Sub2) ref;
            sub2Ref.printB();
        }
    }
}
class Super{
    void print(){
        System.out.println("Print()");
    }
}
class Sub1 extends Super{
    void print(){
        System.out.println("PrintA()");
    }
    void printA(){
        System.out.println("Sub1");
    }
}
class Sub2 extends Super{
    void print(){
        System.out.println("PrintB()");
    }
    void printB(){
        System.out.println("Sub2");
    }
}