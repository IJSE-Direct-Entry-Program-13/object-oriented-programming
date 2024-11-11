import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

void main(){
    System.out.println(MySecondClass.class.getClassLoader());
    System.out.println(MySecondClass.class.getClassLoader().getParent());
    System.out.println(MySecondClass.class.getClassLoader().getParent().getParent());
//    //System.out.println(MySecondClass.class.getClassLoader().getParent().getParent().getParent());
//    System.out.println("-----------");
//    System.out.println(ArrayList.class.getClassLoader());
//    System.out.println(System.class.getClassLoader());
//    System.out.println(Vector.class.getClassLoader());
//    System.out.println(Scanner.class.getClassLoader());
//    System.out.println("--------------");
//    System.out.println(DriverManager.class.getClassLoader());
//    System.out.println(DriverManager.class.getClassLoader().getParent());

//    new MySecondClass();
//    new MySecondClass();
//    new MySecondClass();
//    new MySecondClass();
}