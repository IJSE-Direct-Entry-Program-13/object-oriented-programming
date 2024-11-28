package d;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // MySubInterface.print();

        // via Reflection
        Method printMethod = MySubInterface.class.getInterfaces()[0].getDeclaredMethods()[0];
        printMethod.setAccessible(true);
        printMethod.invoke(MySubInterface.class);

        // MySuperInterface.print();
    }
}
interface MySuperInterface{
    private static void print(){
        System.out.println("MySuperInterface:print()");
    }
}
interface MySubInterface extends MySuperInterface{
//    static void print(){
//        System.out.println("MySubInterface:print()");
//    }
}
