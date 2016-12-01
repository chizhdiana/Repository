package test1.parking;

/**
 * Created by diana on 13.11.16.
 */

public class Parking extends Car{
    private Car car;
    private Car[] parking;
    private int place;

    public Parking(int place) {
        parking =  new Car[place];
        place=0;
    }

    public Parking(String model, String color) {
        super(model, color);
       /* this.car = car; */
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car[] getArr() {
        return parking;
    }

    public void setArr(Car[] arr) {
        this.parking = arr;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int park(Car car)throws ParkFullException {
        if (place <parking.length) {
            parking[place++] = car;
        }
        else{
            if (place!=0) {
                throw new ParkFullException("К сожалению на парковке нет свободных мест!");
            }
        }
        return place;
    }

    public Car live(int place) throws PlaceIsNotBusyException {
        for(int i=0; i<parking.length; i++){
            if (parking[i] ==car) {
                parking[i]=null;
                return null;
            }

            else {
                if (parking[i]!= car) {
                    throw new PlaceIsNotBusyException("Это парковочное место уже  свободно!");
                }
            }
        }
        return car;

    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i<parking.length; i++){
            if(i<place) {
                builder.append(parking[i]+"\n" );

            }
        }
        builder.append("]");
        return builder.toString();

    }

}