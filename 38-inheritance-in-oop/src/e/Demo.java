package e;

public class Demo {
    public static void main(String[] args) {

    }
}

/* Annotations are implicitly abstract */
abstract @interface MyAnnotation {}
@interface MyAnnotation2 {}

/* In Java, Annotations already extends java.lang.annotation.Annotation
* Hence compiler won't allow you to extend further */
// @interface MyAnnotation2 extends MyAnnotation{}

// Since annotations are abstracts, they can be inherited by other types except Annotations
interface MyInterface extends MyAnnotation{}
