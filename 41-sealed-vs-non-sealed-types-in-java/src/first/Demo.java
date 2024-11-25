package first;

import second.MySubClass;

public class Demo {

    public static void main(String[] args) {

    }
}

sealed class MySuperClass permits A, B, C, MySubClass{}

final class A extends MySuperClass {}
final class B extends MySuperClass {}

// final class C extends SuperClass{}

