package h;

public class Demo {

    public static void main(String[] args) {
        RelationshipStatus relStatus = RelationshipStatus.SINGLE;
    }
}

class MyClass{
    public static final MyClass CONST1 = new MyClass();
    public static final MyClass CONST2 = new MyClass();
    private MyClass(){

    }

    public void print(){
        new MyClass();
    }
}

enum Test{
    A, B
}

enum RelationshipStatus{
    SINGLE(10,20), MARRIED(30,40);

    static {
        System.out.println("RelationshipStatus Enum is being initialized");
        // new RelationshipStatus(10,20);
    }

    {
        System.out.println("But you can use instance initializers if you want");
    }

    int x;
    int y;
    private RelationshipStatus(int x, int y){
        // super();
        this.x = x;
        this.y = y;
    }

    public void print(){
        // new RelationshipStatus(10,20);
    }
}

/*
final class RelationshipStatus extends Enum {
    public static final RelationshipStatus SINGLE = new RelationshipStatus("SINGLE", 0,10,20);
    public static final RelationshipStatus MARRIED = new RelationshipStatus("MARRIED", 0,30,40);
}
 */
