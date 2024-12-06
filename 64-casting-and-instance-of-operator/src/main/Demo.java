package main;

public class Demo {
    public static void main(String[] args) {
        int x = 10;         // Identity Conversion
        long l = 10;        // Widening Primitive Conversion
        byte b = 10;        // Narrowing Primitive Conversion
        Short s = 10;       // Narrowing Primitive Conversion + Boxing Conversion

        Integer i = 10;     // Boxing Conversion
        Number n = 10;      // Boxing Conversion + Widening Reference Conversion

        int y = i;          // Unboxing Conversion
        long m = i;         // Unboxing Conversion + Widening Primitive Conversion

        Sub ref = new Sub();            // Identity Conversion
        Super superRef = new Sub();     // Widening Reference Conversion
        ref = (Sub) superRef;           // Narrowing Reference Conversion
    }
}

class Super{}
class Sub extends Super{}
