public class Demo {
    public static void main(String[] args) {
        System.out.println(MyClass.x);
        System.out.println(MyClass.y);
    }
}


class MyClass{
    static int x = 10;
    static int y = x; /*getValue();*/

    public static int getValue(){
        return x;
    }
}