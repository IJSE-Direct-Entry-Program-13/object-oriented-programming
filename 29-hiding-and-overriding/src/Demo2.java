import java.io.Externalizable;
import java.io.Serializable;

public class Demo2 {
    public static void main(String[] args) {

    }
    public static <T extends Serializable> void myMethod(T t){}

    public static <K extends Externalizable> void myMethod(K k){}
}
