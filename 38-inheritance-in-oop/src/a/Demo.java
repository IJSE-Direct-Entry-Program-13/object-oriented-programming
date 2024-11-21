package a;

public class Demo {
    public static void main(String[] args) {

    }
}


// In Java, a class implicitly extends with the java.lang.Object class
class Super{}
class Parent extends Object{}

// Following doesn't work, Java doesn't support multiple inheritance model
// class Child extends Super, Parent{}

class Child1 extends Super{}
class Child2 extends Parent{}

// Java supports hierarchical inheritance
class CrazyChild extends Child1{}
class ProblemChild extends CrazyChild{}

