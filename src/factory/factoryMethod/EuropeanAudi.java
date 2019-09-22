package factory.factoryMethod;

public class EuropeanAudi implements CarInterface {
    @Override
    public void start() {
        System.out.println("Euroepan audi start");
    }

    @Override
    public void accelerate() {
        System.out.println("Euroepan audi accelerate");

    }

    @Override
    public void stop() {
        System.out.println("Euroepan audi stop");

    }
}
