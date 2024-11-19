public class Demo2 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.value);    //10
    }
}
class Parent {
    int value = 10;
}
class Child extends Parent {
    static int value = 20;
}
