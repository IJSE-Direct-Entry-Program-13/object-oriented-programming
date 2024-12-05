package main;

public class Demo {

    public static void main(String[] args) {
//       Object ref = new D();
//       System.out.println(ref instanceof D);
//       System.out.println(ref instanceof B);
//       System.out.println(ref instanceof A);
//       System.out.println(ref instanceof C);
//       System.out.println(ref instanceof E);
//        System.out.println(ref instanceof F);
       // E e = (E) (Object) new D();
       // E e = (E) new D();

        Object o = null;
        C c = null;
        D d = null;
        E e = null;
        F f = null;

        System.out.println(c instanceof Object);
        System.out.println(d instanceof C);
        System.out.println(d instanceof Object);
        System.out.println(e instanceof Object);
        System.out.println(f instanceof Object);

        System.out.println(c instanceof E);
        System.out.println(d instanceof E);
        System.out.println(e instanceof C);
        System.out.println(e instanceof D);

        System.out.println(o instanceof C);
        System.out.println(o instanceof D);
        System.out.println(o instanceof E);
        System.out.println(o instanceof F);

        System.out.println(c instanceof F);
        System.out.println(d instanceof F);
        System.out.println(e instanceof F);
        System.out.println(f instanceof E);
        System.out.println(f instanceof C);
        System.out.println(f instanceof D);
        System.out.println(f instanceof A);
        System.out.println(f instanceof B);
    }
}
interface A{
}
interface B{
}
abstract class C implements A{
}
class D extends C implements B{
}
class E{}
interface F{}