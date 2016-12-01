package test1.carCar;

/**
 * Created by diana on 09.11.16.
 */

public class CarsTest {
    public static void main(String[] args) {
        // BaseCar car = new AbstractCar(); // можно так
        BaseCar car = new Car(); //  так

        car.start();
        car.start();
        car.stop();
        car.stop();
        car.start();
        car.stop();
        car.stop();
    }
}
