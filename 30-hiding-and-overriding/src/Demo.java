import com.sun.jdi.AbsentInformationException;

import java.io.EOFException;
import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {

    }
}

class First extends Exception{}
class Second extends First{}
class Third extends Second{}

class SuperClass{
    void myMethod() throws First, Third{

    }
}

class SubClass extends SuperClass{
    void myMethod() throws Second {

    }
}
