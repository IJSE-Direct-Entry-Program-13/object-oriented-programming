package a;

public class Demo {

    public static void main(String[] args) {
        MyIdea idea = new Strategy2();
        idea.print("Hello World");
    }
}

interface MyIdea{
    void print(String input);
}

class Strategy1 implements MyIdea{
    @Override
    public void print(String input) {
        System.out.println(input);
    }
}
class Strategy2 implements MyIdea{
    @Override
    public void print(String input) {
        System.out.println("input:" + input);
    }
}
class Strategy3 implements MyIdea{
    @Override
    public void print(String input) {
        System.out.println("===============");
        System.out.println("input:" + input);
        System.out.println("===============");
    }
}
