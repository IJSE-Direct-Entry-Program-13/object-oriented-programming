package d;

public class Demo {
    public static void main(String[] args) {
        // new MyEnum();
    }
}

enum MyEnum{
    FIRST(10), SECOND(20);

    private MyEnum(int i) {
    }

    void createInstance(){
        //new MyEnum(10);
    }
}

class MyClass{
    private MyClass() {
    }
    void print(){
        new MyClass();
    }
}
