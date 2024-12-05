package main;

public class Demo {

    public static void main(String[] args) {
        SubChild1 ref = new SubChild1();
        System.out.println(ref instanceof SubChild1);
        System.out.println(ref instanceof Child1);
        System.out.println(ref instanceof Parent);
        System.out.println(ref instanceof Object);

        System.out.println(ref instanceof SubChild2);
        System.out.println(ref instanceof Child2);

        Object o = new Object();

        System.out.println(o instanceof Parent);
        System.out.println(o instanceof Child1);
        System.out.println(o instanceof Child2);
        System.out.println(o instanceof SubChild1);
        System.out.println(o instanceof SubChild2);

        Parent p = new Parent();
        System.out.println(p instanceof Child1);
        System.out.println(p instanceof Child2);
        System.out.println(p instanceof SubChild1);
        System.out.println(p instanceof SubChild2);
    }
}

class Parent{}
class Child1 extends Parent{}
class Child2 extends Parent{}
class SubChild1 extends Child1{}
class SubChild2 extends Child2{}
