package f;

import java.lang.annotation.Annotation;

@MyAnnotation
public class Demo {
    @MyAnnotation
    public static void main(String[] args) {
        System.out.println("ijse");
        // new MyAnnotation();
        //MyAnnotation annotation = new MyImpl();
    }
}

@interface MyAnnotation{ }

//class MyImpl implements MyAnnotation{
//    @Override
//    public Class<? extends Annotation> annotationType() {
//        return null;
//    }
//}
