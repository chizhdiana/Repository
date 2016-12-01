package test1.car;


/**
 * Created by acer on 03.09.2016.
 */
public class ConstrTest {
    public static void main(String[]arg){
        Car car = new Car("Bmv", "Green", 2016);
        car.about();
        Car car1 = new Car();
        car1.about();
        Car car2 = new Car();
        car2.about();


    }
}
