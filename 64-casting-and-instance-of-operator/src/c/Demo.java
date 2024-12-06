package c;

public class Demo {

    public static void main(String[] args) {
        // Here you don't want to mention the casting operator explicitly because
        // the connectivity between these templates is very clear to compiler
        Bottom ref = (Bottom) new Bottom();
        Middle1 ref2 = (Middle1) ref;
        Top ref3 = (Top) ref;

        // Here you want to mention the casting operator explicitly because
        // the connectivity is not very clear to compiler
        Middle2 ref4 = (Middle2) ref3;
    }
}

class Top {}
class Middle1 extends Top {}
class Middle2 extends Top {}
class Bottom extends Middle1 {}
