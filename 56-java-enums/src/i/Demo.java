package i;

public class Demo {
    public static void main(String[] args) {
        MyEnum myenum = MyEnum.CONST1;
        myenum.print();

        //int day = -50
    }
}

enum Status{
    OK, NOT_FOUND, ERROR
}

interface Hello{}

enum MyEnum implements Hello{
    CONST1(10){
        public void print(){
            System.out.println("Hello World");
        }
    },
    CONST2(20);

    MyEnum(int x) {
    }

    public void print(){
        System.out.println("MyEnum:print()");
    }
}
