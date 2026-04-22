class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
class Car {
    Engine engine;
    Car() {
        engine = new Engine();
    }
    void startCar() {
        engine.start();
    }
}
public class compostion {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
