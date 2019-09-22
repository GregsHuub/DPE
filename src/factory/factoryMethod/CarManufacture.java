package factory.factoryMethod;

import factory.simpleFactory.Car;

public abstract class CarManufacture {

    protected abstract CarInterface createCar(String type);

    public void manufactureCar(String type){
        CarInterface car = createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }
}
