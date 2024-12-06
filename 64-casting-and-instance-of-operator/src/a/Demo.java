package a;

public class Demo {

    public static void main(String[] args) {
        int x = 10;
        System.out.println((int) x);        // Identity Conversion
        System.out.println((byte) x);       // Narrowing Primitive Conversion
        System.out.println((long) x);       // Widening Primitive Conversion
        System.out.println((Integer) x);    // Boxing Conversion
        System.out.println((Number) x);     // Boxing Conversion + Widening Reference Conversion
        System.out.println((Object) x);     // Boxing Conversion + Widening Reference Conversion
        // System.out.println((Byte) x);    // Narrowing Primitive Conversion  + Boxing Conversion

        Integer i = 10;
        System.out.println((int) i);        // Unboxing Conversion
        System.out.println((long) i);       // Unboxing Conversion + Widening Primitive Conversion

        Super ref = new Sub();
        Super superRef = (Super) ref;       // Identity Conversion
        Object objectRef = (Object) ref;    // Widening Reference Conversion
        Sub subRef = (Sub) ref;             // Narrowing Reference Conversion
    }
}

class Super {
}

class Sub extends Super {
}