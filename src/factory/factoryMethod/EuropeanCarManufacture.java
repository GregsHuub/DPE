package factory.factoryMethod;

import factory.simpleFactory.Car;

public class EuropeanCarManufacture extends CarManufacture {

    @Override
    protected CarInterface createCar(String type) {
        if (type.equals("Audi")) {
            return new EuropeanAudi();
        }
        else if (type.equals("Ferrari")) {
            return new EuropeanFerrari();
        }
        else {
            throw new IllegalArgumentException("Unknown car." + type);
        }
    }
}
