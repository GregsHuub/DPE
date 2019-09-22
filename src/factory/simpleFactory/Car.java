package factory.simpleFactory;

public interface Car {

     default void start(){
          System.out.println(getClass() + " Start");
     };
     default void stop(){
          System.out.println(getClass() + " stop");
     };
     default void accelerate(){
          System.out.println(getClass() + " accelerate");
     };

}
