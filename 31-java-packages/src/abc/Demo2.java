package abc;

import util.MyClass;
import util.MyInterface;

class Customer{
    MyClass myClass = new MyClass();
    int value = MyInterface.myValue;
}

public class Demo2 {

    public static void main(String[] args) {
        new MyClass();
        System.out.println(MyInterface.myValue);
    }
}


