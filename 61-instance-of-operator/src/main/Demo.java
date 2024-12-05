package main;

public class Demo {

    public static void main(String[] args) {
        //SubChild3 ref = null;
        //System.out.println(ref instanceof P1Child2);
        //System.out.println(ref instanceof P1Child1);

        //SubChild5 ref2 = null;
        //P2Child2 ref3 = (P2Child2) ref2;

        Parent1 ref = new SubChild3();
        System.out.println(ref instanceof SubChild3);
    }
}

class Parent1{}
class Parent2{}
class P1Child1 extends Parent1{}
class P1Child2 extends Parent1{}
class P2Child1 extends Parent2{}
class P2Child2 extends Parent2{}
class SubChild1 extends P1Child1{}
class SubChild2 extends P1Child1{}
class SubChild3 extends P1Child2{}
class SubChild4 extends P1Child2{}
class SubChild5 extends P2Child1{}
class SubChild6 extends P2Child2{}
class SubChild7 extends P2Child2{}
