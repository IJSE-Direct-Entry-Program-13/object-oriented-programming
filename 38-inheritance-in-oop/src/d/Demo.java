package d;

import java.lang.*;

public class Demo extends Object {
    public static void main(String[] args) {
        MyRecord myRecord = new MyRecord("ijse", 10);
    }
}

// Records are implicitly "final"
// final record MyRecord(int i){}

class MySuperClass{}
record SuperRecord(){}
// Records implicitly extends the java.lang.Record, hence compiler won't allow you to extend it
// record MyRecord(int i) extends MySuperClass {}
// record MyRecord(int i) extends SuperRecord {}

 record MyRecord(String name, int i){

 }

// Since Records are implicitly final, you can't further extend it
// class MyClass extends MyRecord{}