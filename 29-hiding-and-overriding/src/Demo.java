import java.io.Serializable;
import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) throws Throwable {
        RuntimeException re = new RuntimeException("ijse");
        throw re;
    }
}

class SuperClass {
    Object myMethod() {
        return 10;
    }
    <A,B> void myCrazyMethod(){

    }
}

class SubClass extends SuperClass {
    @Override
    BigDecimal myMethod() {
        return new BigDecimal(10.2);
    }
    @Override
    <T,K> void myCrazyMethod(){

    }
}
