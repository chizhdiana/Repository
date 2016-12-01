package test1.plane;

/**
 * Created by diana on 13.11.16.
 */

public class Plane extends Wing{

    private Boolean taketOff = false;
    public static final Integer MIN_fuel = 6;
    public static final Integer FUEL_consumption = 2 ;

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    int [][]coordinates = new int[2][2];

    public Plane( int fuel, int x1, int y1, int x2, int y2 ){
        super(fuel);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public Plane(Wing wing1, Wing wing2, int x1, int y1, int x2, int y2){
        super(wing1, wing2);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void takeOFF() {
        if (wing1.getFuel() >= MIN_fuel && wing2.getFuel() >= MIN_fuel) {

            System.out.println("Самолет может взлетать:" + wing1.getFuel() + " " + wing2.getFuel());
        } else {
            System.out.println("Недостаточно топлива");
        }

        if (!taketOff) {
            taketOff = true;
            System.out.println("Самолет взлетел");
            wing1.setFuel(wing1.getFuel() - FUEL_consumption);
            wing2.setFuel(wing2.getFuel() - FUEL_consumption);

            System.out.println("Расход топлива:" + wing1.getFuel() +" "+ wing2.getFuel());
        }
    }

    public void seectRoute(int[][]coordinates) {
        //  int route =0;
        int x1 = this.x1, y1 =this.y1, x2 =this.x2, y2 =this.y2 ;
        for(int i =0; i<coordinates.length; i++) {
            coordinates[i] = new int[x1];
            for (int j = 0; j < coordinates.length; j++) {
                coordinates[j] = new int[y1];

                for (int k = 0; k < coordinates.length; k++) {
                    coordinates[i] = new int[x2];
                    for (int c = 0; c < coordinates.length; j++) {
                        coordinates[c] = new int[y2];
                    }
                }
            }
        }

    }
    public void printRoute() {
        for(int[] route:coordinates) {
            System.out.println("Координаты точки takeoff:" + " " + route + " " );
            System.out.println( "Координаты точки setoff" + " "+ route + " ");
        }

    }
}


