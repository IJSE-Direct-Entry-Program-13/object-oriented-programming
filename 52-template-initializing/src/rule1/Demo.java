package rule1;

public class Demo {

    public static void main(String[] args) {
        new Bottom();
    }
}

interface SupperSupperTopInterface {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("SuperSuperTopInterface is being initialized");
    }
    default void printD(){}
}   // default
interface SuperTopInterface extends SupperSupperTopInterface {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("SuperTopInterface is being initialized");
    }
    default void printA(){}
} // default
interface TopInterface extends SuperTopInterface {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("TopInterface is being initialized");
    }
}

interface SuperMiddleInterface1 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("SuperMiddleInterface1 is being initialized");
    }
}
interface SuperMiddleInterface2 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("SuperMiddleInterface2 is being initialized");
    }
}
interface MiddleInterface extends SuperMiddleInterface1, SuperMiddleInterface2 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("MiddleInterface is being initialized");
    }
    default void printB(){}
} // default

interface SuperBottomInterface1 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("SuperBottomInterface1 is being initialized");
    }
}
interface SuperBottomInterface2 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("SuperBottomInterface2 is being initialized");
    }
    default void printC(){  }
}
interface BottomInterface1 extends SuperBottomInterface1 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("BottomInterface1 is being initialized");
    }
}
interface BottomInterface2 extends SuperBottomInterface2 {
    int VALUE = getValue();

    private static int getValue() {
        initialize();
        return 10;
    }

    private static void initialize() {
        System.out.println("BottomInterface2 is being initialized");
    }
} // default

class Top implements TopInterface {
    static {
        System.out.println("Top class is being initialized");
    }
}
class Middle extends Top implements MiddleInterface {
    static {
        System.out.println("Middle class is being initialized");
    }
}
class Bottom extends Middle implements BottomInterface1, BottomInterface2 {
    static {
        System.out.println("Bottom class is being initialized");
    }
}
