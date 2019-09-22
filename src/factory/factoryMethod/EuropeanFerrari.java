package factory.factoryMethod;

public class EuropeanFerrari implements CarInterface {

    @Override
    public void start() {
        System.out.println("European ferrari start");
    }

    @Override
    public void accelerate() {
        System.out.println("European ferrari accelerate");

    }

    @Override
    public void stop() {
        System.out.println("European ferrari stop");
    }
}
