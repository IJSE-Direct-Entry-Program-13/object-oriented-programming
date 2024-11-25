package first;

import second.MySubClass;

public class Demo {

    public static void main(String[] args) {

    }
}

sealed class SuperClass permits A, B, C, MySubClass {}

final class A extends SuperClass{}
final class B extends SuperClass{}

// final class C extends SuperClass{}

