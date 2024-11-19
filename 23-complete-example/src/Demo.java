public class Demo {

    public static void main(String[] args) {
        System.out.println(new Child(20).getValue());
    }
}

class Parent{
    Child child;
    int value = -5;
    {
        System.out.println("Parent instance initializer");
    }
    public Parent(Integer value){
        this.value = value;
        child.print();
    }
    public Parent(int value) {
        this(Integer.valueOf(value));
        this.value = value;
        child.print();
    }
    {
        child = (Child) this;
        child.print();
    }
    static{
        System.out.println("Parent static initializer");
    }
    int getValue(){
        return value;
    }
}

class Child extends Parent{
    {
        System.out.println("Child instance initializer");
        print();
    }
    static int value = -20;
    public Child(int value) {
        super(value);
        this.value = super.getValue() + 10;
    }
    void print(){
        System.out.println("value=" + value);
    }
    {
        System.out.println("value=" + value);
    }
    static {
        System.out.println("Child Static Initializer");
        value += 5;
    }
}
