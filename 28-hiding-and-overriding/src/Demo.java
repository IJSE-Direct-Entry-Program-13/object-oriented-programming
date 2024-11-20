public class Demo {
    public static void main(String[] args) {

    }
}

class SuperClass {
    native void m1();
}

abstract class SubClass extends SuperClass {
    @Override
    abstract void m1();
}

// If the super class is an abstract type and the super class has an abstract method m1
// Then you have two choices,
// 1. You may define a subclass as an abstract type, or
// 2. You may define a subclass as a concrete type
// If you define the subclass as an abstract type, then you have four choices,
// 1. You may define the m1 as an abstract method again
// 2. You may define the m1 as a concrete type
// 3. You may define the m1 as a native method or,
// 4. You may not define the m1 at all
// If you define the subclass as a concrete type, then you have to define the
// m1 as either a concrete method or a native method