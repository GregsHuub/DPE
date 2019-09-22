package factory.simpleFactory;

public class CarManufacture {

    private SimpleFactory simpleFactory;

    public CarManufacture(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory;
    }

    public void manufactureCar(String type){
        Car car = simpleFactory.createCar(type);
        car.start();
        car.accelerate();
        car.stop();
    }
}
