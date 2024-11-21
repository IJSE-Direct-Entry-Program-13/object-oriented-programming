package f;

public class Demo {
    public static void main(String[] args) {

    }
}

interface SuperInterface1{}
interface SuperInterface2{}
interface SuperInterface3{}

// In Java, interfaces follow multiple inheritance model whereas classes follow single inheritance model
interface SubInterface extends SuperInterface1, SuperInterface2, SuperInterface3{}

class MyClass implements SuperInterface1, SuperInterface2, SuperInterface3{}
enum MyEnum implements SuperInterface1, SuperInterface2, SuperInterface3{}
record MyRecord() implements SuperInterface1, SuperInterface2, SuperInterface3{}

// @interface MyAnnotation extends SuperInterface1{}


