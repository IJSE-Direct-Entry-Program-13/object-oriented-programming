package h;

public class Demo {
    public static void main(String[] args) {
        Cal cal = new Cal();
        F fn = value -> System.out.println(value);
        G fn2 = (x, y) -> sum(x, y);
        G fn3 = (x, y) -> cal.sum(x, y);

        // Scope Resolution Operator (::) Method Referencing
        F fn1 = System.out::println;
        G fn21 = Demo::sum;
        G fn31 = cal::sum;
    }
    static int sum(int a, int b) {
        return a + b;
    }
}
class Cal{
    int sum(int a, int b){
        return a + b;
    }
}

interface F{
    void print(String value);
}

interface G {
    int exec(int a, int b);
}
