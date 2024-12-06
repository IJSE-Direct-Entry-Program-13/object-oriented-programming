package b;

public class Demo {
    public static void main(String[] args) {
        Middle1 ref = new Bottom();

        System.out.println((Middle1) ref);          // Identity Conversion
        System.out.println((Top) ref);              // Widening Reference Conversion
        System.out.println((Object) ref);           // Widening Reference Conversion
        System.out.println((Bottom) ref);           // Narrowing Reference Conversion
        System.out.println((Middle2) (Top) ref);
        //System.out.println((Middle2) ref);          // Widening Reference Conversion + Narrowing Reference Conversion

        System.out.println(ref instanceof Middle1);     // Identity Conversion
        System.out.println(ref instanceof Top);         // Widening Reference Conversion
        System.out.println(ref instanceof Object);      // Widening Reference Conversion
        System.out.println(ref instanceof Bottom);      // Narrowing Reference Conversion
        // System.out.println(ref instanceof Middle2);
    }
}

class Top { }
class Middle1 extends Top {}
class Middle2 extends Top {}

class Bottom extends Middle1 {
}
