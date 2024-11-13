public class Demo2 {

    public static void main(String[] args) {
        String s1 = "hello";        // new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);

        Integer i = 10;             // new Integer(10);
        Integer i2 = 10;
        System.out.println(i == i2);
        Integer i3 = 500;           // new Integer(500);
        Integer i4 = 500;           // new Integer(500);
        System.out.println(i3 == i4);
        Integer i5 = 127;          // new Integer(127)
        Integer i6 = 127;
        System.out.println(i5 == i6);

        String s3 = "hello" + "world";
        String s4 = "helloworld";           // This does not create a new string
        System.out.println(s3 == s4);       // true

        String s5 = "hello";
        String s6 = s5 + "world";           // This creates a new string
        System.out.println(s6 == s4);       // false
    }
}
