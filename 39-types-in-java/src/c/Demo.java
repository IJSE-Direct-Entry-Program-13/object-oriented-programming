package c;

public class Demo {

    public static void main(String[] args) {
        MyCrazyRichTradingAlgorithm algorithm = new MyCrazyRichTradingAlgorithm();
        algorithm.buy();
        algorithm.sell();
    }
}

class MySuperTradingAlgorithm {
    public final void buy(){
        System.out.println("Buy");
    }
    public final void sell(){
        System.out.println("Sell");
    }
    public void print(){
        System.out.println("Print()");
    }
}
 class MyCrazyRichTradingAlgorithm extends MySuperTradingAlgorithm{
     @Override
     public void print() {
         System.out.println("Buy Update 2");
     }
 }
