package b;

public class Demo {
    public static void main(String[] args) {
        A a = new C();
        a.print();
    }
}
class A{
    int a = 10;
    int getValue(){
        return a;
    }
    void print(){
        System.out.println("value=" + getValue());
    }
}
class B extends A{
    static int a = 20;
    void print(){
        System.out.println("value=" + ((A)this).getValue());
    }
    int getValue(){
        return ((C)this).getValue();
    }
}
class C extends B{
    int a = 30;
    void print(){
        super.print();
    }
    int getValue(){
        return super.a;
    }
}
