class MyClass{
    public static void main(String[] abc){
        System.out.println("MyClass: main()");
    }
}
enum MyEnum {
    ;
    public static void main(String[] args){
        System.out.println("MyEnum: main()");
    }
}
record MyRecord(){
    public static void main(String... something){
        System.out.println("MyRecord: main()");
    }
}
interface MyInterface {
    public static void main(String... hello){
        System.out.println("MyInterface: main()");
    }
}
@interface MyAnnotation {
//    void main(){
//        System.out.println("MyAnnotation: main()");
//    }
}

