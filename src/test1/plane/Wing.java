package test1.plane;

/**
 * Created by diana on 13.11.16.
 */


public class Wing {
    private int fuel;

    Wing wing1;
    Wing wing2;


    public Wing( int fuel) {
        this.fuel = fuel;

    }

    public Wing(Wing wing1, Wing wing2) {
        this.wing1 = wing1;
        this.wing2 = wing2;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

   /* public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    } */
}


