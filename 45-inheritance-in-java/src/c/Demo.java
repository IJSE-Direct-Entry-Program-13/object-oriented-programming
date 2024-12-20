package c;

public class Demo {

    public static void main(String[] args) {
        B ref = new C();
        ref.execute();
        // C
        // A
    }
}

class A{
    static int a = 10;
    static void print(){
        System.out.println("value=" + a);
    }
    void execute(){
        System.out.println("A");
        ((B)(this)).print(this);
    }
}

class B extends A{
    int a = 20;
    static void print(Object o){
        System.out.println("value=" + ((B)o).a);
    }
}

class C extends B{
    static int a = 30;
    void execute(){
        System.out.println("C");
        super.execute();
    }
}
