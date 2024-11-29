package h;

public class Demo {
    public static void main(String[] args) {
        MyIdea myIdea = new BuddhiIdea();
        myIdea.printRupees();
    }
}
interface MyIdea{
    void printRupees();
    default void printDollar(){

    }
}
class BuddhiIdea implements MyIdea{
    @Override
    public void printRupees() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Print. LKR 5000");
        }
    }

}

