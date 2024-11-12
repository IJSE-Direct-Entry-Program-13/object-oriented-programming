import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        var c1 = new Customer();
        var c2 = new Customer();
        var c3 = new Customer();
        System.out.println("---------------");
        MyCustomClassLoader customClassLoader = new MyCustomClassLoader(null);
        Class<?> customerClzObject = customClassLoader.loadClass("Customer");
        customerClzObject.newInstance();
        c1.x = 50;
        System.out.println(c2.x);
        System.out.println(c3.x);
        var c4 = (Customer)  customerClzObject.newInstance();
//        System.out.println(c4 instanceof  Customer);
//        System.out.println(c4.getClass().getDeclaredField("x").get(c4));
//        customer.newInstance();
    }

}

class MyCustomClassLoader extends ClassLoader {

    public MyCustomClassLoader() {
    }

    public MyCustomClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("/home/ranjith-suranga/Desktop/%s.class".formatted(name));
        try {
            byte[] bytes = Files.readAllBytes(file.toPath());
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
