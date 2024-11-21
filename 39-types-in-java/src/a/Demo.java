package a;

public class Demo {

    public static void main(String[] args) {
        // new MyMillionDollarIdea();
        MyMillionDollarIdea time2getRich = new MyMillionDollarIdeaImpl();
    }
}

interface MyMillionDollarIdea{
    public abstract void print();
}

class MyMillionDollarIdeaImpl implements MyMillionDollarIdea{

    @Override
    public void print() {

    }
}
