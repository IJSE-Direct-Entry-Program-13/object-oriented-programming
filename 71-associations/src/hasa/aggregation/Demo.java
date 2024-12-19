package hasa.aggregation;

public class Demo {

    public static void main(String[] args) {
        Engine engine = new Engine();
        BreakSystem breakSystem = new BreakSystem();
        Car car = new Car(engine, breakSystem);
        System.out.println(car.getBreakSystem());
        System.out.println(car.getEngine());
        car = null;
        System.out.println(engine); // We still have a way to refer to the engine
        System.out.println(breakSystem); // We still have a way to refer to the break system
    }
}

class Car{
    private Engine engine;
    private BreakSystem breakSystem;

    public Car(Engine engine, BreakSystem breakSystem) {
        this.engine = engine;
        this.breakSystem = breakSystem;
    }

    public Engine getEngine() { return engine; }
    public BreakSystem getBreakSystem() { return breakSystem; }
}

class Engine{ }
class BreakSystem{}