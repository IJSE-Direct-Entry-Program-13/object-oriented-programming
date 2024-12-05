package main;

public class Demo {

    public static void main(String[] args) {
        // 1
        Middle1 ref = new Middle1();
        //System.out.println(ref instanceof Middle3);

        // 2
        Middle1 ref2 = new Middle1();
        System.out.println(ref2 instanceof Top);

        // 3
        Top ref3 = new Bottom();
        //System.out.println(ref3 instanceof Middle2);
        System.out.println(ref3 instanceof Middle3);
        System.out.println((Middle3) ref3);
        
        //System.out.println( (Middle3) ref);
        //System.out.println((Middle3) (Top) ref);
        //System.out.println((Top) ref instanceof Middle3);
    }
}

interface A{}
interface B{}
interface C{}

class Top implements B{}
class Middle1 extends Top{}
class Bottom extends Middle1 implements C{}
class Middle2{}
class Middle3 extends Top{}
class Middle4 extends Top{}
