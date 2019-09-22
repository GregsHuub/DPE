package factory.factoryMethod;

public class AmericanAudi implements CarInterface {
    @Override
    public void start() {
        System.out.println("American Audi start");
    }

    @Override
    public void accelerate() {
        System.out.println("American Audi accelerate");

    }

    @Override
    public void stop() {
        System.out.println("American audi stop");

    }
}
