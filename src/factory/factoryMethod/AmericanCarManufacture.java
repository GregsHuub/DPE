package factory.factoryMethod;


public class AmericanCarManufacture extends CarManufacture {

    @Override
    protected CarInterface createCar(String type) {
        if (type.equals("Audi")) {
            return new AmericanAudi();
        }
        else if (type.equals("Ferrari")) {
            return new AmericanFerrari();
        }
        else {
            throw new IllegalArgumentException("Unknown car." + type);
        }
    }
}
