package b;

public class Demo {
    public static void main(String[] args) {
        MySubClass clz = new MySubClass();
        System.out.println("---------");
        System.out.println(clz.value);
    }
}
interface Interface1 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("Interface1 is being initialized");
        return true;
    }
//    int value = getValue();
//    private static int getValue() {
//        return 10;
//    }
}
interface Interface2 {
    boolean INITIALIZED = initialize();
    private static boolean initialize() {
        System.out.println("Interface2 is being initialized");
        return true;
    }
    int value = getValue();
    private static int getValue(){
        return 20;
    }
}
class MySuperClass {
//    static int value = 30;
}
class MySubClass extends MySuperClass implements Interface1, Interface2 {
//    static int value = 40;
}

