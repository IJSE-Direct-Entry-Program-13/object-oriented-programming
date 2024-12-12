package d;

public class Demo {

    public static void main(String[] args) {
//        MyFun fn = new MyFun(){
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };
        MyFun fn = (a, b) -> a + b;
        int result = fn.sum(10, 20);
        System.out.println(result);
    }
}

// @FunctionalInterface
interface MyFun{
    int sum(int a, int b);
}

//class MyClass implements MyFun{
//
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}
