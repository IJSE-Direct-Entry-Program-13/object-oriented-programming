package b;

public class Demo {

    public static void main(String[] args) {
        // new Bitcoin();
        // new BitcoinImpl();
        new CompleteBitcoinImpl();
    }
}

abstract class Bitcoin {
    public void blockChain(){
        System.out.println("Crazy block chain");
    }

    public abstract void print();
    public abstract int getNumberOfCoins();
}

abstract class BitcoinImpl extends Bitcoin {
    public void print(){
        System.out.println("Bitcoin print");
    }
}

class CompleteBitcoinImpl extends BitcoinImpl {
    @Override
    public int getNumberOfCoins() {
        return 10;
    }
}
