package test1.carCar;

/**
 * Created by diana on 09.11.16.
 */

public class Car implements BaseCar {
    private Boolean status = false;
    @Override
    public void start() {
        if(!status){
            System.out.println("Машина завеена");
            status = true;
        }

    }

    @Override
    public void stop() {
        if(status){
            System.out.println("Машина не  завеена");
            status = false;
        }

    }
}

