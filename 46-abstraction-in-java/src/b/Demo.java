package b;

// For formatting
// Ctrl + Alt + L
// Ctrl + Shift + Alt + L
interface CalculatorIdea {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b);
    double mod(int a, int b);
}

// Ctrl + O

public class Demo {
    public static void main(String[] args) {
        CalculatorIdea cal = null; /*= new MyCalculator();*/
        System.out.println(cal.add(10,20));
        System.out.println(cal.subtract(10,20));
        System.out.println(cal.divide(10,20));
        System.out.println(cal.multiply(10,20));
        System.out.println(cal.mod(10,20));
    }
}
