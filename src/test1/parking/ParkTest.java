package test1.parking;

/**
 * Created by diana on 13.11.16.
 */

public class ParkTest {
    public static void main(String[] args) {

        Parking parking = new Parking(16);

        Car car = new Car("Honda", "red");
        Car car1 = new Car("Suzuky", "black");
        Car car2 = new Car("BMV", "red");
        Car car3 = new Car("BMN", "metallic");
        Car car4 = new Car("Audi", "red");
        Car car5 = new Car("Audi", "white");
        Car car6 = new Car("Honda", "black");
        Car car7 = new Car("Hunday", "green");
        Car car8 = new Car("Hunday", "white");
        Car car9 = new Car("Hunday", "white");
        Car car11 = new Car("Hunday", "white");
        Car car12 = new Car("Hunday", "white");
        Car car13 = new Car("Hunday", "white");
        Car car14 = new Car("Hunday", "white");
        Car car15 = new Car("Hunday", "white");
        Car car16 = new Car("Hunday", "white");
        Car car17 = new Car("Hunday", "white");

        try {
            System.out.println( parking.park(car));
            System.out.println( parking.park(car1));
            System.out.println( parking.park(car2));
            System.out.println( parking.park(car3));
            System.out.println( parking.park(car4));
            System.out.println( parking.park(car5));
            System.out.println( parking.park(car6));
            System.out.println( parking.park(car7));
            System.out.println( parking.park(car8));
            System.out.println( parking.park(car9));
            System.out.println( parking.park(car11));
            System.out.println( parking.park(car12));
            System.out.println( parking.park(car13));
            System.out.println( parking.park(car14));
            System.out.println( parking.park(car15));
            System.out.println( parking.park(car16));
            System.out.println( parking.park(car17));

        } catch (ParkFullException e){
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        System.out.println(parking);

        try{
            System.out.println(parking.live(6));
            System.out.println(parking.live(7));
            System.out.println(parking.live(8));
            System.out.println(parking.live(6));

        } catch(PlaceIsNotBusyException ex){
            System.out.println(ex.getMessage());
            //ex.printStackTrace();
        }

        // System.out.println(parking);
    }

}