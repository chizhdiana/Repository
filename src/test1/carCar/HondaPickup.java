package test1.carCar;

/**
 * Created by diana on 09.11.16.
 */


public class HondaPickup extends LadaSedan implements Pickup{

    private Integer weight = 1000;

    public void weight() {
        System.out.println("Грузоподьемность" + weight);

    }


    public void transportingCargo() {
        System.out.println("Перевожу груз");

    }
}
