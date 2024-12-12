package g;

public class Demo {
    public static void main(String[] args) {
        G fun = (id, name) -> System.out.printf("id=%s, name=%s", id, name);
        fun.print("C001", "Kasun");
        fun.print("C002", "Nuwan");
    }
}

interface G{
    void print(String id, String name);
}
