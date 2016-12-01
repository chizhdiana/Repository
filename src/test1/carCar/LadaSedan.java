package test1.carCar;

/**
 * Created by diana on 09.11.16.
 */

public class LadaSedan extends AbstractCar implements Sedan { // методы старт и стоп будут браться из Абстрактсар
    private Integer passengers = 0;


    @Override
    public void passengers() {
        System.out.println("Кол пассажиров "+ passengers);

    }

    @Override
    public void addPassenger() {
        if(passengers <=SEETS){
            passengers++;
            System.out.println("Посадка первого пассажира");
        }

    }

    @Override
    public void removePassenger() {
        if(passengers >0){
            passengers--;
            System.out.println(" Высадка одного пассажира");
        }

    }

    @Override
    public void transportingPassengers() {
        System.out.println("Перевожу "+ passengers + "пасажиров");

    }
}

