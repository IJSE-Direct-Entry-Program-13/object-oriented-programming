public class Demo {

    public static void main(String[] args) {
        System.out.println(new SubType().x);
    }
}

interface SuperType{
    int x = 10;
}

class SubType implements SuperType{
    String x = "ijse";
}
