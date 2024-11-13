public class Demo3 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass);
    }
}

class MyClass /* extends Object */{
    {
        System.out.println("a=" + getValue());
        //System.out.println(a);
    }

    int a = 10;

    public MyClass() {
        super();
        System.out.println("MyClass Constructor()");
        System.out.println("a=" + a);
    }

    int getValue(){
        return a;
    }

    {
        System.out.println("MyClass Instance Initializer");
    }
}
