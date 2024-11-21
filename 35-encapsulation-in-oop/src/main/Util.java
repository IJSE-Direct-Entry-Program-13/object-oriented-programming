package main;

public class Util {
    private static int value1 = 10;
    static int value2 = 20;
    protected static int value3 = 30;
    public static int value4 = 40;

    private static void printValue1(){
        System.out.println("value1=" + value1);
    }

    static void printValue2(){
        System.out.println("value2=" + value2);
    }

    protected static void printValue3(){
        System.out.println("value3=" + value3);
    }

    public static void printValue4(){
        System.out.println("value4=" + value4);
    }

    public static void print(){
        System.out.println(MyStaticNestedClass.number);
    }

    static class MyStaticNestedClass{
        private static int number = 50;
        public static void print(){
            System.out.println(MyStaticNestedClass.number);
            System.out.println(number);

            System.out.println(value1);
            System.out.println(Util.value1);
            printValue1();
            Util.printValue1();
        }
    }
}
