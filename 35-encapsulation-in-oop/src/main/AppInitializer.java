package main;

public class AppInitializer {

    public static void main(String[] args) {
        //System.out.println(Util.value1);
        System.out.println(Util.value2);
        System.out.println(Util.value3);
        System.out.println(Util.value4);

        //Util.printValue1();
        Util.printValue2();
        Util.printValue3();
        Util.printValue4();

        Util.MyStaticNestedClass.print();
        //System.out.println(Util.MyStaticNestedClass.number);
    }
}
