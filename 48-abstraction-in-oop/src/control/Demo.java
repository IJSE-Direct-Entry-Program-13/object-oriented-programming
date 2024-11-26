package control;

public class Demo {

    public static void main(String[] args) {
        Car priusCar = new Prius();
        priusCar.applyGas();
        priusCar.applyBreak();
        priusCar.horn();
    }
}

interface Car{
    void applyGas();
    void applyBreak();
    void horn();
}
class Prius implements Car {
    @Override
    public void applyGas() {
        System.out.println("Start hybrid system");
        System.out.println("Gas...");
    }
    @Override
    public void applyBreak() {
        System.out.println("Break...");
        System.out.println("Stop hybrid system");
    }
    @Override
    public void horn() {
        System.out.println("@#!#$#$");
    }
}