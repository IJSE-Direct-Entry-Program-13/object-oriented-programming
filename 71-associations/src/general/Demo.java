package general;

public class Demo {

    public static void main(String[] args) {
        TopLevelClass.NestedClass.print();
    }
}
class TopLevelClass{
    private static int x = 10;
    static{
        System.out.println("Top level class is being initialized");
    }
    static class NestedClass{
        static {
            System.out.println("Nested class is being initialized");
        }
        static void print(){
            System.out.println("x = " + x);
        }
    }
}