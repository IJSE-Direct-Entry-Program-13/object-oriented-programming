package f;

public class Demo {

    public static void main(String[] args) {
        int c = 5;
        //c = 7;
        F fn = (a, b) -> {
            System.out.println(a);
            int result = a * a;
            System.out.println(result);
            result += (b * b) + c;
            return result;
        };

        fn.exec(10,20);
    }
}

interface F{
    int exec(int a, int b);
}
