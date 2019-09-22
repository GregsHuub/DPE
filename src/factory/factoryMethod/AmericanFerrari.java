package factory.factoryMethod;

public class AmericanFerrari implements CarInterface {
    @Override
    public void start() {
        System.out.println("American ferrari start");
    }

    @Override
    public void accelerate() {
        System.out.println("American ferrari accelerate");


    }

    @Override
    public void stop() {
        System.out.println("American ferrari stop");

    }
}
