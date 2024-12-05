package main;

public class Demo {

    public static void main(String[] args) {
//        Middle ref = null;
//        System.out.println(ref instanceof Top);

        Top ref2 = new Middle2();
        System.out.println(ref2 instanceof Middle); // false
        System.out.println(ref2 instanceof Middle2);    // true
        //System.out.println(ref2 instanceof Middle3);

        System.out.println(ref2 instanceof C);  // true
        System.out.println(ref2 instanceof A);
        System.out.println(ref2 instanceof B);
        System.out.println(ref2 instanceof D);
        System.out.println(ref2 instanceof Crazy); // false
        System.out.println((Crazy) ref2); // ClassCasstException
    }
}

interface Crazy{}
interface A{}
interface B{}
interface C extends A,B{}
interface D extends A,C{}

class Top implements C{}
class Middle extends Top implements A,B{}
class Middle2 extends Top implements D{}
class Middle3{}
