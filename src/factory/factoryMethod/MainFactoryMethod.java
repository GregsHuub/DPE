package factory.factoryMethod;

public class MainFactoryMethod {
    public static void main(String[] args) {

        CarManufacture carManufacture = new EuropeanCarManufacture();
        carManufacture.manufactureCar("Ferrari");

        carManufacture = new AmericanCarManufacture();
        carManufacture.manufactureCar("Audi");

    }
}
