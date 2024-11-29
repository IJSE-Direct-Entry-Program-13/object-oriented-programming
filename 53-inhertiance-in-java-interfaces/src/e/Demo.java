package e;

public class Demo {

    public static void main(String[] args) {
        //System.out.println(SubInterface.VALUE);
        //SubInterface.print();
    }
}

interface Interface1 {
    int VALUE = getValue();
    private static int getValue() {
        return 10;
    }
    public static void print(){
        System.out.println("Interface1:print()");
    }
}
interface Interface2 {
    int VALUE = getValue();
    private static int getValue() {
        return 20;
    }
    public static void print(){
        System.out.println("Interface2:print()");
    }
}
interface SubInterface extends Interface1, Interface2 {
//    int VALUE = getValue();
//    private static int getValue(){
//        return 30;
//    }
//    public static void print(){
//        System.out.println("SubInterface:print()");
//    }
}