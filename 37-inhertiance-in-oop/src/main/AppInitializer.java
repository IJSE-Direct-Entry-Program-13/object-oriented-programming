package main;

import java.lang.annotation.Annotation;

public class AppInitializer {

    public static void main(String[] args) {

    }
}

class Parent {}

interface SuperInterface1{}

@interface MyAnnotation{}

//===================================================

// class <-> class
class Sub extends Parent {}

// interface <-> interface
interface SuperInterface2 extends SuperInterface1{}

// class <- interface
class MyClass implements SuperInterface2{}

// interface <- annotation
interface SuperInterface3 extends MyAnnotation{}

// enum <- interface
enum MyEnum implements SuperInterface1{}

// enum <- record
record MyRecord() implements SuperInterface1{}

// class <- annotation
abstract class MyClass2 implements MyAnnotation{}

// enum <- annotation
enum MyEnum2 implements MyAnnotation{
    ;

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

