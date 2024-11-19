public class Demo {
    public static void main(String[] args) {
        Sub sub = new Sub(10, 5);
        System.out.println(sub.value);
        System.out.println(sub.getValue());
        Super superClz = sub;
        System.out.println(superClz.value);
        superClz.print();
    }
}

class Super{
    int value = -10;
    public Super() {
        System.out.println("Super()");
    }
    {
        if (this instanceof Sub) ((Middle)this).value = value;
        print();
    }
    void print(){
        System.out.println("value=" + value);
    }
}
class Middle extends Super{
    static int value;
    public Middle(int value) {
        super.print();
        this.value += value;
        this.print();
        System.out.println("Middle()");
    }
    static{
        value += new Super().value * 2;
        System.out.println("Static Initializer");
    }
    int getValue(){
        return value;
    }
}
class Sub extends Middle {
    int value = 10;
    public Sub(int value) {
        super(value);
        super.print();
        System.out.println("value=" + this.value);
    }
    public Sub(int value, int value2){
        this(value);
        this.value = value2;
        System.out.println("value=" + getValue());
        ((Sub) this).print();
    }
}
