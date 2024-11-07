public class MyThirdClass {

    static {
        System.out.println("Static Initializer1: MyThirdClass is being initialized");
    }

    public MyThirdClass() {
        System.out.println("MyThirdClass Constructor()");
    }

    static {
        System.out.println("Static Initializer2: MyThirdClass is being initialized");
    }
}
