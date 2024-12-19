package hasa.composition;

public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getEngine());
        System.out.println(car.getBreakSystem());
        car = null;
        System.out.println(car.getEngine());
        System.out.println(car.getBreakSystem());
    }
}

class Car{
    private Engine engine = new Engine();
    private BreakSystem breakSystem = new BreakSystem();
    public Engine getEngine() { return engine; }
    public BreakSystem getBreakSystem() { return breakSystem; }
}

class Engine{ }
class BreakSystem{}
