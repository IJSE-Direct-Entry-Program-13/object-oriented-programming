package a;

public class Demo {

    public static void main(String[] args) {

    }
}

sealed class ToyotaCar permits Prius, Camry, Axio{
    public void applyGas(){
        System.out.println("Apply Gas");
    }
    public void applyBreak(){
        System.out.println("Apply Break");
    }
    public void shiftGears(){
        System.out.println("Shift Gears");
    }
    public void horn(){
        System.out.println("#@$!RD$#%#$%");
    }
}
final class Prius extends ToyotaCar{}
sealed class Camry extends ToyotaCar permits HybridCamry{}
final class HybridCamry extends Camry{}
non-sealed class Axio extends ToyotaCar{}

// class Nano extends Axio{}

