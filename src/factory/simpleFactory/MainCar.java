package factory.simpleFactory;

public class MainCar {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        CarManufacture carManufacture = new CarManufacture(simpleFactory);

        carManufacture.manufactureCar("Audi");
        carManufacture.manufactureCar("Ferrari");





    }
}
