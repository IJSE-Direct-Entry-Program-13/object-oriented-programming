public class Demo {
    public static void main(String[] args) {
        System.out.println(((Child) new Child()).x);
        System.out.println((new Child()).x);
        System.out.println(((Parent) new Child()).x);
        System.out.println("==============");
        System.out.println(Parent.y);
        System.out.println(Child.y);
        System.out.println("==============");
        System.out.println((new Child()).y);
        System.out.println(((Parent) new Child()).y);
        System.out.println("==============");
        System.out.println((new Child()).z);
        System.out.println(((Parent) new Child()).z);
        System.out.println("==============");
        System.out.println((new Child()).k);
        System.out.println(((Parent) new Child()).k);
        new Child().print();
        Child child = new Child();
        child.new NestedClass();
    }
}
class Parent {
    int x = 10;
    static int y = 10;
    static int z = 10;
    int k = 10;
    void print(){
        System.out.println(k);
    }
    class NestedClass{
        public NestedClass() {
            System.out.println("Parent.NestedClass");
        }
    }
    static void printNumber() {}
}
class Child extends Parent {
    String x = "ijse";
    static boolean y = true;
    double z = 10.5;
    static String k = "dep";
    class NestedClass{
        public NestedClass() {
            System.out.println("Child.NestedClass");
        }
    }
    public static void printNumber(int x) {

    }
}
