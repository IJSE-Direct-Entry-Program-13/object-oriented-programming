package controller;

import main.Util;

public class MyController {

    public static void main(String[] args) {
        //System.out.println(Util.value1);
        //System.out.println(Util.value2);
        //System.out.println(Util.value3);
        System.out.println(Util.value4);

        //Util.printValue1();
        //Util.printValue2();
        //Util.printValue3();
        Util.printValue4();

//        System.out.println(ExtUtil.value3);
        System.out.println(ExtUtil.value4);
        ExtUtil.printValue3();
        ExtUtil.printValue4();
        ExtUtil.value4 = 100;
        Util.printValue4();
    }
}
