package factory.simpleFactory;

public class Audi implements Car {

    @Override
    public void start() {
        System.out.println("Audi startuje");
    }
}
