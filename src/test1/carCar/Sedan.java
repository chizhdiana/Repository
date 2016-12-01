package test1.carCar;

/**
 * Created by diana on 09.11.16.
 */

public interface Sedan extends BaseCar {
    public static final int SEETS = 4;

    public void passengers();
    public void addPassenger();  // в машину сел человек
    public void removePassenger();
    public void transportingPassengers();

}
